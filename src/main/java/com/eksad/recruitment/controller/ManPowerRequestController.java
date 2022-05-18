/*
 * Copyright 2022 rey.
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
package com.eksad.recruitment.controller;

import com.eksad.recruitment.service.manpowerrequest.ManPowerRequestService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

/**
 *
 * @author rey
 */
@Controller("/hello")
public class ManPowerRequestController {

    @Inject
    private ManPowerRequestService mppService;

    @Get(processes = MediaType.APPLICATION_JSON)
    public String getHellow() {
        return mppService.helloWorldService();
    }

}
