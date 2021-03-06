/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;
import java.io.Serializable;

/**
 * <p>
 * Describes an Elastic IP address.
 * </p>
 */
public class ElasticIp  implements Serializable  {

    /**
     * The Elastic IP address
     */
    private String ip;

    /**
     * The Elastic IP address name.
     */
    private String name;

    /**
     * The AWS region. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     */
    private String region;

    /**
     * The Elastic IP address
     *
     * @return The Elastic IP address
     */
    public String getIp() {
        return ip;
    }
    
    /**
     * The Elastic IP address
     *
     * @param ip The Elastic IP address
     */
    public void setIp(String ip) {
        this.ip = ip;
    }
    
    /**
     * The Elastic IP address
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ip The Elastic IP address
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ElasticIp withIp(String ip) {
        this.ip = ip;
        return this;
    }
    
    
    /**
     * The Elastic IP address name.
     *
     * @return The Elastic IP address name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The Elastic IP address name.
     *
     * @param name The Elastic IP address name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The Elastic IP address name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The Elastic IP address name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ElasticIp withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * The AWS region. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @return The AWS region. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public String getRegion() {
        return region;
    }
    
    /**
     * The AWS region. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @param region The AWS region. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public void setRegion(String region) {
        this.region = region;
    }
    
    /**
     * The AWS region. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param region The AWS region. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ElasticIp withRegion(String region) {
        this.region = region;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIp() != null) sb.append("Ip: " + getIp() + ", ");
        if (getName() != null) sb.append("Name: " + getName() + ", ");
        if (getRegion() != null) sb.append("Region: " + getRegion() + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIp() == null) ? 0 : getIp().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ElasticIp == false) return false;
        ElasticIp other = (ElasticIp)obj;
        
        if (other.getIp() == null ^ this.getIp() == null) return false;
        if (other.getIp() != null && other.getIp().equals(this.getIp()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getRegion() == null ^ this.getRegion() == null) return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false) return false; 
        return true;
    }
    
}
    