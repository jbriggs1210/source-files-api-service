package com.e451.domain;

public class CouponRedemption {
    private Long householdKey;
    private String day;
    private Long couponUpc;
    private Long campaign;

    private Long id;

    public CouponRedemption() {
    }

    public CouponRedemption(Long householdKey, String day, Long couponUpc, Long campaign, Long id) {
        this.householdKey = householdKey;
        this.day = day;
        this.couponUpc = couponUpc;
        this.campaign = campaign;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHouseholdKey() {
        return householdKey;
    }

    public void setHouseholdKey(Long householdKey) {
        this.householdKey = householdKey;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Long getCouponUpc() {
        return couponUpc;
    }

    public void setCouponUpc(Long couponUpc) {
        this.couponUpc = couponUpc;
    }

    public Long getCampaign() {
        return campaign;
    }

    public void setCampaign(Long campaign) {
        this.campaign = campaign;
    }
}
