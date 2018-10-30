/*
 * Copyright 2014-2019 Logo Business Solutions
 * (a.k.a. LOGO YAZILIM SAN. VE TIC. A.S)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.lbs.tedam.webservice.rest.client;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class RestClientTest {

    @Test
    public void testPostValue() {
        RestClient restClient = new RestClient();
        String url = "http://localhost:9080/TedamManager/api/ScriptRestService/getSnapshotValueList/";
        String value = restClient.getValue(url, "37");
        assertNotNull(value);
    }
}
