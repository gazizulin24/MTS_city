package org.gazizulin.iot_connector_service.mqtt;

import org.apache.logging.log4j.util.InternalException;
import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class MqttConsumer extends MqttConfig implements MqttCallback {

    private String brokerUrl = null;
    final private String colon = ":";
    final private String clientId = UUID.randomUUID().toString();

    private MqttClient mqttClient = null;
    private MqttConnectOptions connectionOptions = null;
    private MemoryPersistence persistence = null;

    private static final Logger logger = LoggerFactory.getLogger(MqttConsumer.class);

    public MqttConsumer() {
        logger.info("I am MqttSub impl");
        this.config();
    }

    @Override
    public void connectionLost(Throwable cause) {
        logger.info("Connection Lost" + cause);
        this.config();
    }

    @Override
    protected void config(String broker, Integer port, Boolean ssl, Boolean withUserNamePass) {
        logger.info("Inside Parameter Config");
        String protocal = this.TCP;

        this.brokerUrl = protocal + this.broker + colon + port;
        this.persistence = new MemoryPersistence();
        this.connectionOptions = new MqttConnectOptions();

        try {
            this.mqttClient = new MqttClient(brokerUrl, clientId, persistence);
            this.connectionOptions.setCleanSession(true);
            this.connectionOptions.setPassword(this.password.toCharArray());
            this.connectionOptions.setUserName(this.userName);
            this.mqttClient.connect(this.connectionOptions);
            this.mqttClient.setCallback(this);
        } catch (MqttException me) {
            throw new InternalException("Not Connected");
        }
    }

    @Override
    protected void config() {
        logger.info("Inside Config with parameter");
        this.brokerUrl = this.TCP + this.broker + colon + this.port;
        this.persistence = new MemoryPersistence();
        this.connectionOptions = new MqttConnectOptions();
        try {
            this.mqttClient = new MqttClient(brokerUrl, clientId, persistence);
            this.connectionOptions.setCleanSession(true);
            this.connectionOptions.setPassword(this.password.toCharArray());
            this.connectionOptions.setUserName(this.userName);
            this.mqttClient.connect(this.connectionOptions);
            this.mqttClient.setCallback(this);
        } catch (MqttException me) {
            throw new InternalException("Not Connected");
        }
    }



    @Override
    public void messageArrived(String mqttTopic, MqttMessage mqttMessage) throws Exception {
        System.out.println("***********************************************************************");
        System.out.println("Message Arrived at Topic: " + mqttTopic + "  Message: "
                + new String(mqttMessage.getPayload()));
        System.out.println("***********************************************************************");


        // TODO: будущая обработка в сервисе приходящего сообщения и перенаправление его в kafka

    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {

    }
}
