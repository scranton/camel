/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.sjms.springboot;

import javax.annotation.Generated;
import javax.jms.ConnectionFactory;
import org.apache.camel.component.sjms.TransactionCommitStrategy;
import org.apache.camel.component.sjms.jms.ConnectionResource;
import org.apache.camel.component.sjms.jms.DestinationCreationStrategy;
import org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy;
import org.apache.camel.component.sjms.jms.MessageCreatedStrategy;
import org.apache.camel.spi.HeaderFilterStrategy;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * The sjms component (simple jms) allows messages to be sent to (or consumed
 * from) a JMS Queue or Topic (uses JMS 1.x API).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.sjms")
public class SjmsComponentConfiguration {

    /**
     * A ConnectionFactory is required to enable the SjmsComponent. It can be
     * set directly or set set as part of a ConnectionResource.
     */
    private ConnectionFactory connectionFactory;
    /**
     * A ConnectionResource is an interface that allows for customization and
     * container control of the ConnectionFactory. See Plugable Connection
     * Resource Management for further details.
     */
    @NestedConfigurationProperty
    private ConnectionResource connectionResource;
    /**
     * The maximum number of connections available to endpoints started under
     * this component
     */
    private Integer connectionCount = 1;
    /**
     * Pluggable strategy for encoding and decoding JMS keys so they can be
     * compliant with the JMS specification. Camel provides one implementation
     * out of the box: default. The default strategy will safely marshal dots
     * and hyphens (. and -). Can be used for JMS brokers which do not care
     * whether JMS header keys contain illegal characters. You can provide your
     * own implementation of the
     * org.apache.camel.component.jms.JmsKeyFormatStrategy and refer to it using
     * the notation.
     */
    @NestedConfigurationProperty
    private JmsKeyFormatStrategy jmsKeyFormatStrategy;
    /**
     * To configure which kind of commit strategy to use. Camel provides two
     * implementations out of the box default and batch.
     */
    @NestedConfigurationProperty
    private TransactionCommitStrategy transactionCommitStrategy;
    /**
     * To use a custom DestinationCreationStrategy.
     */
    @NestedConfigurationProperty
    private DestinationCreationStrategy destinationCreationStrategy;
    /**
     * To use a custom TimedTaskManager
     */
    private TimedTaskManagerNestedConfiguration timedTaskManager;
    /**
     * To use the given MessageCreatedStrategy which are invoked when Camel
     * creates new instances of javax.jms.Message objects when Camel is sending
     * a JMS message.
     */
    @NestedConfigurationProperty
    private MessageCreatedStrategy messageCreatedStrategy;
    /**
     * When using the default
     * org.apache.camel.component.sjms.jms.ConnectionFactoryResource then should
     * each javax.jms.Connection be tested (calling start) before returned from
     * the pool.
     */
    private Boolean connectionTestOnBorrow = true;
    /**
     * The username to use when creating javax.jms.Connection when using the
     * default org.apache.camel.component.sjms.jms.ConnectionFactoryResource.
     */
    private String connectionUsername;
    /**
     * The password to use when creating javax.jms.Connection when using the
     * default org.apache.camel.component.sjms.jms.ConnectionFactoryResource.
     */
    private String connectionPassword;
    /**
     * The client ID to use when creating javax.jms.Connection when using the
     * default org.apache.camel.component.sjms.jms.ConnectionFactoryResource.
     */
    private String connectionClientId;
    /**
     * The max wait time in millis to block and wait on free connection when the
     * pool is exhausted when using the default
     * org.apache.camel.component.sjms.jms.ConnectionFactoryResource.
     */
    private Long connectionMaxWait = 5000L;
    /**
     * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
     * header to and from Camel message.
     */
    @NestedConfigurationProperty
    private HeaderFilterStrategy headerFilterStrategy;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public ConnectionFactory getConnectionFactory() {
        return connectionFactory;
    }

    public void setConnectionFactory(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public ConnectionResource getConnectionResource() {
        return connectionResource;
    }

    public void setConnectionResource(ConnectionResource connectionResource) {
        this.connectionResource = connectionResource;
    }

    public Integer getConnectionCount() {
        return connectionCount;
    }

    public void setConnectionCount(Integer connectionCount) {
        this.connectionCount = connectionCount;
    }

    public JmsKeyFormatStrategy getJmsKeyFormatStrategy() {
        return jmsKeyFormatStrategy;
    }

    public void setJmsKeyFormatStrategy(
            JmsKeyFormatStrategy jmsKeyFormatStrategy) {
        this.jmsKeyFormatStrategy = jmsKeyFormatStrategy;
    }

    public TransactionCommitStrategy getTransactionCommitStrategy() {
        return transactionCommitStrategy;
    }

    public void setTransactionCommitStrategy(
            TransactionCommitStrategy transactionCommitStrategy) {
        this.transactionCommitStrategy = transactionCommitStrategy;
    }

    public DestinationCreationStrategy getDestinationCreationStrategy() {
        return destinationCreationStrategy;
    }

    public void setDestinationCreationStrategy(
            DestinationCreationStrategy destinationCreationStrategy) {
        this.destinationCreationStrategy = destinationCreationStrategy;
    }

    public TimedTaskManagerNestedConfiguration getTimedTaskManager() {
        return timedTaskManager;
    }

    public void setTimedTaskManager(
            TimedTaskManagerNestedConfiguration timedTaskManager) {
        this.timedTaskManager = timedTaskManager;
    }

    public MessageCreatedStrategy getMessageCreatedStrategy() {
        return messageCreatedStrategy;
    }

    public void setMessageCreatedStrategy(
            MessageCreatedStrategy messageCreatedStrategy) {
        this.messageCreatedStrategy = messageCreatedStrategy;
    }

    public Boolean getConnectionTestOnBorrow() {
        return connectionTestOnBorrow;
    }

    public void setConnectionTestOnBorrow(Boolean connectionTestOnBorrow) {
        this.connectionTestOnBorrow = connectionTestOnBorrow;
    }

    public String getConnectionUsername() {
        return connectionUsername;
    }

    public void setConnectionUsername(String connectionUsername) {
        this.connectionUsername = connectionUsername;
    }

    public String getConnectionPassword() {
        return connectionPassword;
    }

    public void setConnectionPassword(String connectionPassword) {
        this.connectionPassword = connectionPassword;
    }

    public String getConnectionClientId() {
        return connectionClientId;
    }

    public void setConnectionClientId(String connectionClientId) {
        this.connectionClientId = connectionClientId;
    }

    public Long getConnectionMaxWait() {
        return connectionMaxWait;
    }

    public void setConnectionMaxWait(Long connectionMaxWait) {
        this.connectionMaxWait = connectionMaxWait;
    }

    public HeaderFilterStrategy getHeaderFilterStrategy() {
        return headerFilterStrategy;
    }

    public void setHeaderFilterStrategy(
            HeaderFilterStrategy headerFilterStrategy) {
        this.headerFilterStrategy = headerFilterStrategy;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class TimedTaskManagerNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.sjms.taskmanager.TimedTaskManager.class;
    }
}
