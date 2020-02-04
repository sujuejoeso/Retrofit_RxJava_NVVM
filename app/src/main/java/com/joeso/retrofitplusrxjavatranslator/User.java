package com.joeso.retrofitplusrxjavatranslator;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class User implements Serializable {
    public User() {

    }

    @SerializedName("is_new_account")
    Boolean isNewAccount;
    @SerializedName("un_read_notification_counts")
    Integer unread_notification;
    @SerializedName("id")
    Integer id;
    @SerializedName("email")
    String email;
    @SerializedName("first_name")
    String firstName;
    @SerializedName("last_name")
    String lastName;
    @SerializedName("created_at")
    String createdAt;
    @SerializedName("updated_at")
    String updateAt;
    @SerializedName("phone")
    String phone;
    @SerializedName("sign_up_date")
    String signUpDate;
    @SerializedName("gender")
    String gender;
    @SerializedName("date_of_birth")
    String dateOfBirth;
    @SerializedName("referral_code")
    String referralCode;
    @SerializedName("referral_by_code")
    String referralByCode;
    @SerializedName("payment_status")
    String paymentStatus;
    @SerializedName("emergency_contact_name")
    String emergencyContactName;
    @SerializedName("emergency_contact_number")
    String emergencyContactNumber;
    @SerializedName("emergency_contact_relation")
    String emergencyContactRelation;
    @SerializedName("status")
    String status;
    @SerializedName("has_redeemed_free_session")
    Boolean has_redeemed_free_session;
    @SerializedName("access_token")
    String accessToken;
    @SerializedName("profile_picture_url")
    String portrait;
    @SerializedName("location_id")
    Integer currentLocation;
    @SerializedName("finished_location_tutorial")
    Boolean finishedLocationTutorial;
    @SerializedName("earned_free_weeks")
    Integer earnedFreeWeeks;
    @SerializedName("cancellation_date")
    String cancellationDate;
    @SerializedName("membership_since")
    String membershipSince;
    @SerializedName("transferring_location_id")
    Integer transferringLocationId;

    public Boolean getNewAccount() {
        return isNewAccount;
    }

    public void setNewAccount(Boolean newAccount) {
        isNewAccount = newAccount;
    }

    public Integer getUnread_notification() {
        return unread_notification;
    }

    public void setUnread_notification(Integer unread_notification) {
        this.unread_notification = unread_notification;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSignUpDate() {
        return signUpDate;
    }

    public void setSignUpDate(String signUpDate) {
        this.signUpDate = signUpDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    public String getReferralByCode() {
        return referralByCode;
    }

    public void setReferralByCode(String referralByCode) {
        this.referralByCode = referralByCode;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }

    public String getEmergencyContactRelation() {
        return emergencyContactRelation;
    }

    public void setEmergencyContactRelation(String emergencyContactRelation) {
        this.emergencyContactRelation = emergencyContactRelation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getHas_redeemed_free_session() {
        return has_redeemed_free_session;
    }

    public void setHas_redeemed_free_session(Boolean has_redeemed_free_session) {
        this.has_redeemed_free_session = has_redeemed_free_session;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public Integer getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Integer currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Boolean getFinishedLocationTutorial() {
        return finishedLocationTutorial;
    }

    public void setFinishedLocationTutorial(Boolean finishedLocationTutorial) {
        this.finishedLocationTutorial = finishedLocationTutorial;
    }

    public Integer getEarnedFreeWeeks() {
        return earnedFreeWeeks;
    }

    public void setEarnedFreeWeeks(Integer earnedFreeWeeks) {
        this.earnedFreeWeeks = earnedFreeWeeks;
    }

    public String getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(String cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    public String getMembershipSince() {
        return membershipSince;
    }

    public void setMembershipSince(String membershipSince) {
        this.membershipSince = membershipSince;
    }

    public Integer getTransferringLocationId() {
        return transferringLocationId;
    }

    public void setTransferringLocationId(Integer transferringLocationId) {
        this.transferringLocationId = transferringLocationId;
    }
}
