/*
 * Copyright 2016 the original author or authors.
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

package org.springframework.cloud.dataflow.core;

/**
 * Spring Cloud Stream property keys.
 *
 * @author Mark Fisher
 */
public class StreamPropertyKeys {

	// @formatter:off (not working)
	static final String PREFIX = "spring.cloud.stream.";
	/**
	 * Prefix for Spring Cloud Stream Metrics.
	 */
	public static final String METRICS_PREFIX = PREFIX + "metrics.";
	/**
	 * METRICS Key property key.
	 */
	public static final String METRICS_KEY = METRICS_PREFIX + "key";
	/**
	 * METRICS properties property key.
	 */
	public static final String METRICS_PROPERTIES = METRICS_PREFIX + "properties";
	/**
	 * Instance Count property key.
	 */
	public static final String INSTANCE_COUNT = PREFIX + "instanceCount";

    // @formatter:on
}
