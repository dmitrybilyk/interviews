package com.learn.java8.lambda.stream.toSortConversations;

import org.joda.time.DateTimeUtils;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Conversation> conversationList = new ArrayList<>();
		Conversation conversation = new Conversation();
		conversation.setName("Yesterday");
		conversation.setStartDate(LocalDateTime.now().minus(1, ChronoUnit.DAYS).toInstant(ZoneOffset.UTC));
		Conversation conversation2 = new Conversation();
		conversation2.setName("Today");
		conversation2.setStartDate(LocalDateTime.now().toInstant(ZoneOffset.UTC));
		Conversation conversation3 = new Conversation();
		conversation3.setName("Tomorrow");
		conversation3.setStartDate(LocalDateTime.now().plus(1, ChronoUnit.DAYS).toInstant(ZoneOffset.UTC));

		conversationList.add(conversation2);
		conversationList.add(conversation3);
		conversationList.add(conversation);


		System.out.println(conversationList.stream()
						.sorted((o1, o2) -> o2.getStartDate().compareTo(o1.getStartDate())).collect(Collectors.toList()).get(0).getName());


	}
}
