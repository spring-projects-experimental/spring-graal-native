/*
 * Copyright 2019-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.context.origin;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.lang.Nullable;

/**
 * Strategy interface to analyze the structure of a {@link BeanFactory}.
 *
 * @author Stephane Nicoll
 */
public interface BeanDefinitionOriginAnalyzer {

	/**
	 * Analyze a {@link BeanFactory} structure using the specified
	 * {@link BeanFactoryStructureAnalysis analysis}. Components that are detected should
	 * be flagged using {@link BeanFactoryStructureAnalysis#markAsResolved(BeanDefinitionDescriptor)}
	 * @param analysis the current analysis
	 */
	@Nullable
	void analyze(BeanFactoryStructureAnalysis analysis);

}
