package org.forest.service;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class ProducerTest {
    public static void main(String[] args) {
        Properties props = new Properties();

        props.put("bootstrap.servers", "localhost:9092");

        props.put("acks", "all");

        props.put("restries", "0");

        props.put("batch.size", "16384");

        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        Producer<String, String> producer = null;
        try {
            producer = new KafkaProducer<String, String>(props);

            System.out.println("Producer starts to create message...");

            for (int i = 0; i < 100; i++) {
                Thread.sleep(1000);
                String msg = "send message count: " + i;

                producer.send(new ProducerRecord<String, String>("mytopic", msg));
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            assert producer != null;
            producer.close();
        }

    }
}
