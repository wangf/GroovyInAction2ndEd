package com.manning.groovyinaction;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author Gordon Dickens (gordonad)
 * @since 2013-06-29
 */
public class Section521Test {

    private static final Logger logger = LoggerFactory.getLogger(Section521Test.class);


    @Test
    public void first() {
        Collection collection = new ArrayList();
        collection.add(new ItemType("one", "one"));
        collection.add(new ItemType("two", "this is two"));
        // Java
        for (Iterator iter = collection.iterator(); iter.hasNext(); ) {
            ItemType item = (ItemType) iter.next();
            logger.debug("Item name {}", item.name);
            // do something with item
        }

    }

    @Test
    public void second() {
        List list = new ArrayList();
        list.add(new ItemType("one", "one"));
        list.add(new ItemType("two", "this is two"));

        // Java
        for (int i = 0; i < list.size(); i++) {
            ItemType item = (ItemType) list.get(i);
            logger.debug("Item name {}", item.name);

            // do something with item
        }

    }

    @Test
    public void javaFive() {
        List<ItemType> list = new ArrayList<ItemType>();
        list.add(new ItemType("one", "one"));
        list.add(new ItemType("two", "this is two"));
        
        // Java 5
        for (ItemType item : list) {
            // do something with item
            logger.debug("Item name {}", item.name);

        }

    }


    class ItemType {
        String name;
        String description;

        public ItemType(String name, String description) {
            this.name = name;
            this.description = description;
        }

        String getName() {
            return name;
        }

        void setName(String name) {
            this.name = name;
        }

        String getDescription() {
            return description;
        }

        void setDescription(String description) {
            this.description = description;
        }
    }

}
