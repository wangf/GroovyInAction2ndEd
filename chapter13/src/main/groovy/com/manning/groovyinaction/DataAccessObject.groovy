package com.manning.groovyinaction

import groovy.sql.Sql

abstract class DataAccessObject {
    Sql db

    abstract List getFields()                                //#1

    def dataSet()    { db.dataSet(tablename) }               //#2
    def getIdField() { tablename.toLowerCase() + 'Id' }      //#2
    def getWhereId() { "WHERE $idField = ?"}                 //#2

    String getTablename() {
        def name = this.getClass().name
        return name[name.lastIndexOf('.')+1..-4]
    }
    def create(List args) {                                  //#3
        Map argMap = [:]
        args.eachWithIndex { arg, i -> argMap[fieldNames[i]] = arg }
        dataSet().add argMap
    }
    Map getSchema() {
        Map result = [:]
        fieldNames.each {result[it] = fields[fields.indexOf(it)+1]}
        return result
    }
    List getFieldNames() {
        List result = []
        0.step(fields.size(),2) { result << fields[it] }
        return result
    }
    def update(field, newValue, id) {
        def stmt = "UPDATE $tablename SET $field = ? $whereId"
        db.executeUpdate stmt, [newValue, id]
    }
    def delete(id) {
        def stmt = "DELETE FROM $tablename $whereId"
        db.executeUpdate stmt, [id]
    }
    def all(sortField) {                                        //#4
        def selects = fieldNames + idField
        def result = []
        def stmt = "SELECT " + selects.join(',') +
                " FROM $tablename ORDER BY $sortField"
        db.eachRow(stmt.toString()){ rs ->
            Map businessObject = [:]
            selects.each { businessObject[it] = rs[it] }
            result << businessObject
        }
        return result
    }
}

