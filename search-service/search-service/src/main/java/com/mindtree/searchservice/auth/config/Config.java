package com.mindtree.searchservice.auth.config;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = { "com.mindtree.repository" })
@EnableMongoRepositories(basePackages = { "com.mindtree.mongo.repository" })
@ComponentScan(basePackages = { "com.mindtree.service" })
public class Config {

	@Value("${elasticsearch.host:localhost}")
	public String host;
	@Value("${elasticsearch.port:9200}")
	public int port;
	
	@Value("${elasticsearch.home:/C:/Users/M1052874/HandsOn/Software/elastic/elasticsearch-oss-7.3.0-windows-x86_64/elasticsearch-7.3.0}")
    private String elasticsearchHome;
 
    @Value("${elasticsearch.cluster.name:my-application}")
    private String clusterName;

	public String getHost() {
		return host;
	}

	public int getPort() {
		return port;
	}
	
	  @Bean
	    public Client client() {
	        Settings elasticsearchSettings = Settings.builder()
	          .put("client.transport.sniff", true)
	          .put("path.home", elasticsearchHome)
	          .put("cluster.name", clusterName).build();
	        TransportClient client = new PreBuiltTransportClient(elasticsearchSettings);
	        try {
				client.addTransportAddress(new TransportAddress(InetAddress.getByName("127.0.0.1"), port));
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
	        return client;
	    }

	/*@Bean
	public Client client() {
		TransportClient client = null;
		try {
			System.out.println("host:" + host + "port:" + port);
			client = new PreBuiltTransportClient(Settings.EMPTY)
					.addTransportAddress(new TransportAddress(InetAddress.getByName(host), port));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return client;
	}*/

}
