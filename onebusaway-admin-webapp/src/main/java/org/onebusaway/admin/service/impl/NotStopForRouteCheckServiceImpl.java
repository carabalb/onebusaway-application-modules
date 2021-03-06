/**
 * Copyright (C) 2016 Cambridge Systematics, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onebusaway.admin.service.impl;

import org.onebusaway.admin.model.ParsedBundleValidationCheck;

public class NotStopForRouteCheckServiceImpl extends
    BundleValidationCheckServiceImpl {

  @Override
  public String buildQuery(String envURI, String apiKey, String apiQuery,
      String siriQuery, ParsedBundleValidationCheck check) {
    String query = envURI;
    query += apiQuery + STOP + check.getStopId() + ".json?key="
        + apiKey + "&version=2";
    return query;
  }
}
