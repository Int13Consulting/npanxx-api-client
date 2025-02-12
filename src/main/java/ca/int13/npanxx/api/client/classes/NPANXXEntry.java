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

package ca.int13.npanxx.api.client.classes;

/**
 *
 * @author mgamble
 */
public class NPANXXEntry {
    private String npa;
    private String nxx;
    private String rateCenter;
    private String province;
    private String country;

    /**
     * @return the npa
     */
    public String getNpa() {
        return npa;
    }

    /**
     * @param npa the npa to set
     */
    public void setNpa(String npa) {
        this.npa = npa;
    }

    /**
     * @return the nxx
     */
    public String getNxx() {
        return nxx;
    }

    /**
     * @param nxx the nxx to set
     */
    public void setNxx(String nxx) {
        this.nxx = nxx;
    }

    /**
     * @return the rateCenter
     */
    public String getRateCenter() {
        return rateCenter;
    }

    /**
     * @param rateCenter the rateCenter to set
     */
    public void setRateCenter(String rateCenter) {
        this.rateCenter = rateCenter;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
            
}
