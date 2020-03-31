/*
 * Copyright 2020 the original author or authors.
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
package org.springframework.boot.autoconfigure.cache;

import org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration.CacheConfigurationImportSelector;
import org.springframework.graal.extension.NativeImageHint;
import org.springframework.graal.extension.NativeImageConfiguration;
import org.springframework.graal.extension.TypeInfo;
import org.springframework.graal.type.AccessBits;

@NativeImageHint(trigger=CacheConfigurationImportSelector.class, follow=true,
	typeInfos = {@TypeInfo(types= {
		GenericCacheConfiguration.class, EhCacheCacheConfiguration.class,
		HazelcastCacheConfiguration.class, InfinispanCacheConfiguration.class,
		JCacheCacheConfiguration.class, CouchbaseCacheConfiguration.class,
		RedisCacheConfiguration.class, CaffeineCacheConfiguration.class,
		SimpleCacheConfiguration.class, NoOpCacheConfiguration.class
	},access=AccessBits.CONFIGURATION)})
public class Hints implements NativeImageConfiguration { }