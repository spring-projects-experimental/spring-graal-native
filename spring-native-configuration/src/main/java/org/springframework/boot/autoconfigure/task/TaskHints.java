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
package org.springframework.boot.autoconfigure.task;

import org.springframework.nativex.extension.NativeConfiguration;
import org.springframework.nativex.extension.NativeHint;
import org.springframework.nativex.extension.TypeInfo;
import org.springframework.nativex.type.AccessBits;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@NativeHint(trigger = TaskExecutionAutoConfiguration.class, typeInfos = {
		@TypeInfo(types = { ThreadPoolTaskExecutor.class },
			access = AccessBits.CLASS //| AccessBits.DECLARED_METHODS
			| AccessBits.DECLARED_CONSTRUCTORS) }, abortIfTypesMissing = true)
public class TaskHints implements NativeConfiguration {
}
