package rmi.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import rmi.common.Greeter;

@Configuration
public class ServerConfig {

    @Bean
    public Greeter helloGreeter() {
        return new HelloGreeter();
    }

    @Bean
    public RmiServiceExporter exporter() {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setService(helloGreeter());
        rmiServiceExporter.setServiceName("Greeter123");
        rmiServiceExporter.setServiceInterface(Greeter.class);
        return rmiServiceExporter;
    }

}
