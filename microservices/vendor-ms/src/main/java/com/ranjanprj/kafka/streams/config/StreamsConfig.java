package com.ranjanprj.kafka.streams.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.ranjanprj.kafka.streams.stream.GreetingsStreams;

@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {
}
