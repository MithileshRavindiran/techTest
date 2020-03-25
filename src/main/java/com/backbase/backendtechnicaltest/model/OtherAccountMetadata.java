package com.backbase.backendtechnicaltest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OtherAccountMetadata {
    @JsonProperty("public_alias")
    private Object publicAlias;
    @JsonProperty("private_alias")
    private Object privateAlias;
    @JsonProperty("more_info")
    private Object moreInfo;
    @JsonProperty("URL")
    private Object url;
    @JsonProperty("image_URL")
    private Object imageUrl;
    @JsonProperty("open_corporates_URL")
    private Object openCorporatesUrl;
    @JsonProperty("corporate_location")
    private Object corporateLocation;
    @JsonProperty("physical_location")
    private Object physicalLocation;

    public Object getPublicAlias() {
        return publicAlias;
    }

    public void setPublicAlias(Object publicAlias) {
        this.publicAlias = publicAlias;
    }

    public Object getPrivateAlias() {
        return privateAlias;
    }

    public void setPrivateAlias(Object privateAlias) {
        this.privateAlias = privateAlias;
    }

    public Object getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(Object moreInfo) {
        this.moreInfo = moreInfo;
    }

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

    public Object getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Object imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Object getOpenCorporatesUrl() {
        return openCorporatesUrl;
    }

    public void setOpenCorporatesUrl(Object openCorporatesUrl) {
        this.openCorporatesUrl = openCorporatesUrl;
    }

    public Object getCorporateLocation() {
        return corporateLocation;
    }

    public void setCorporateLocation(Object corporateLocation) {
        this.corporateLocation = corporateLocation;
    }

    public Object getPhysicalLocation() {
        return physicalLocation;
    }

    public void setPhysicalLocation(Object physicalLocation) {
        this.physicalLocation = physicalLocation;
    }
}
