/*
 *     Copyright 2025 Int13 Consulting Inc. @ https://int13.ca
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ca.int13.npanxx.api.client;

/**
 *
 * @author mgamble
 */
public class Version {

    /*
        0.0.1 - Initial Release

     */
    public Version() {

    }

    private final String buildNumber = "0.0.2";
    private final String buildName = "Right Here, Right Now";
    private final String author = "Matthew M. Gamble";

    /**
     * @return the buildNumber
     */
    public String getBuildNumber() {
        return buildNumber;
    }

    /**
     * @return the buildName
     */
    public String getBuildName() {
        return buildName;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

}
