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
package org.springframework.social.yammer.api.impl.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.social.yammer.api.YammerProfile;

@JsonIgnoreProperties(ignoreUnknown=true)
abstract class UserReferenceMixin {

	@JsonCreator
	public UserReferenceMixin(
			@JsonProperty("id") long id, 
			@JsonProperty("url")String url, 
			@JsonProperty("web_url")String webUrl,
			@JsonProperty("name")String name
			) {	}

	@JsonProperty("mugshot_url")
	String mugshotUrl;
	
	@JsonProperty("stats")
	YammerProfile.Stats userStats;
	
	@JsonProperty("full_name")
	String fullName;
	
	@JsonProperty("job_title")
	String title;

	@JsonProperty("email")
	String email;

	@JsonProperty("is_group_admin")
	boolean isGroupAdmin;
}