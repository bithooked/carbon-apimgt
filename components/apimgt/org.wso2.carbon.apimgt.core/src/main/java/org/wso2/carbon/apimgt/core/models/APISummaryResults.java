/*
 *
 *   Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.carbon.apimgt.core.models;

import java.util.List;

/**
 * Matching results related to API summary detail. Only immutable instances of this class
 * can be created via the provided inner static {@code Builder} class which implements the builder pattern
 * as outlined in "Effective Java 2nd Edition by Joshua Bloch(Item 2)"
 */
public final class APISummaryResults {
    private final List<APISummary> apiSummaryList;
    private final boolean isMoreResultsExist;
    private final int nextOffset;

    private APISummaryResults(Builder builder) {
        apiSummaryList = builder.apiSummaryList;
        isMoreResultsExist = builder.isMoreResultsExist;
        nextOffset = builder.nextOffset;
    }

    public List<APISummary> getApiSummaryList() {
        return apiSummaryList;
    }

    public boolean isMoreResultsExist() {
        return isMoreResultsExist;
    }

    public int getNextOffset() {
        return nextOffset;
    }

    /**
     * {@code APISummaryResults} builder static inner class.
     */
    public static final class Builder {
        private List<APISummary> apiSummaryList;
        private boolean isMoreResultsExist;
        private int nextOffset;

        public Builder(List<APISummary> apiSummaryList, boolean isMoreResultsExist, int nextOffset) {
            this.apiSummaryList = apiSummaryList;
            this.isMoreResultsExist = isMoreResultsExist;
            this.nextOffset = nextOffset;
        }

        /**
         * Returns a {@code APISummaryResults} built from the parameters previously set.
         *
         * @return a {@code APISummaryResults} built with parameters of this {@code APISummaryResults.Builder}
         */
        public APISummaryResults build() {
            return new APISummaryResults(this);
        }
    }
}