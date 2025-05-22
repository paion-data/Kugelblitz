/*
 * Copyright 2025 Paion Data. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.paiondata.kugelblitz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

/**
 * Swagger UI metadata configuration.
 */
@Configuration
public class SwaggerConfig {

    /**
     * Configures the Swagger UI metadata.
     *
     * @return the complete configuration to be injected into the Spring context
     */
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Kugelblitz")
                                .version("0.0.1")
                                .description("Kugelblitz REST API Interface")
                                .contact(
                                        new Contact()
                                                .name("Paion Data")
                                                .url("https://github.com/paion-data")
                                                .email("jiaqiliu@paion-data.dev")
                                )
                                .license(
                                        new License()
                                                .name("Apache License, Version 2.0")
                                                .url("https://www.apache.org/licenses/LICENSE-2.0")
                                )
                );
    }
}
