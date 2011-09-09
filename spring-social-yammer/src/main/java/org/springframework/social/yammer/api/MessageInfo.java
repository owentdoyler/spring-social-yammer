/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.yammer.api;

import java.util.List;

/**
 * @author Morten Andersen-Gott
 *
 */
public class MessageInfo {

	private List<YammerMessage> messages;
	private YammerMessageMeta metadata;
	
	public MessageInfo(List<YammerMessage> messages, YammerMessageMeta meta) {
		this.messages=messages;
		this.metadata=meta;
	}
	
	public List<YammerMessage> getMessages() {
		return messages;
	}
	
	public YammerMessageMeta getMetadata() {
		return metadata;
	}
	
}