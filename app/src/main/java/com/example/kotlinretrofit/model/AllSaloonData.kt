package com.example.kotlinretrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AllSaloonData {

    @SerializedName("id")
    @Expose
    private var id: Int? = null
    @SerializedName("salon_register_id")
    @Expose
    private var salonRegisterId: Int? = null
    @SerializedName("salon_setup_flag")
    @Expose
    private var salonSetupFlag: String? = null
    @SerializedName("owner_name")
    @Expose
    private var ownerName: String? = null
    @SerializedName("is_guild_member")
    @Expose
    private var isGuildMember: String? = null
    @SerializedName("guild_membership_number")
    @Expose
    private var guildMembershipNumber: String? = null
    @SerializedName("contact_details")
    @Expose
    private var contactDetails: String? = null
    @SerializedName("city")
    @Expose
    private var city: String? = null
    @SerializedName("state")
    @Expose
    private var state: String? = null
    @SerializedName("postal_code")
    @Expose
    private var postalCode: String? = null
    @SerializedName("opening_days_hours")
    @Expose
    private var openingDaysHours: String? = null
    @SerializedName("opening_time")
    @Expose
    private var openingTime: String? = null
    @SerializedName("closing_time")
    @Expose
    private var closingTime: String? = null
    @SerializedName("salon_logo")
    @Expose
    private var salonLogo: String? = null
    @SerializedName("salon_logo_path")
    @Expose
    private var salonLogoPath: String? = null
    @SerializedName("salon_description")
    @Expose
    private var salonDescription: String? = null
    @SerializedName("owner_picture")
    @Expose
    private var ownerPicture: Any? = null
    @SerializedName("branding_picture1")
    @Expose
    private var brandingPicture1: Any? = null
    @SerializedName("branding_picture2")
    @Expose
    private var brandingPicture2: Any? = null
    @SerializedName("booking_terms_conditions")
    @Expose
    private var bookingTermsConditions: String? = null
    @SerializedName("cancellation_policy")
    @Expose
    private var cancellationPolicy: String? = null
    @SerializedName("salon_status")
    @Expose
    private var salonStatus: String? = null
    @SerializedName("created_date")
    @Expose
    private var createdDate: String? = null
    @SerializedName("modified_date")
    @Expose
    private var modifiedDate: String? = null
    @SerializedName("guild_expired_date")
    @Expose
    private var guildExpiredDate: String? = null
    @SerializedName("modified_by")
    @Expose
    private var modifiedBy: String? = null
    @SerializedName("salon_name")
    @Expose
    private var salonName: String? = null
    @SerializedName("salon_id")
    @Expose
    private var salonId: Int? = null
    @SerializedName("closing_day")
    @Expose
    private var closingDay: String? = null

    fun getId(): Int? {
        return id
    }

    fun setId(id: Int?) {
        this.id = id
    }

    fun getSalonRegisterId(): Int? {
        return salonRegisterId
    }

    fun setSalonRegisterId(salonRegisterId: Int?) {
        this.salonRegisterId = salonRegisterId
    }

    fun getSalonSetupFlag(): String? {
        return salonSetupFlag
    }

    fun setSalonSetupFlag(salonSetupFlag: String) {
        this.salonSetupFlag = salonSetupFlag
    }

    fun getOwnerName(): String? {
        return ownerName
    }

    fun setOwnerName(ownerName: String) {
        this.ownerName = ownerName
    }

    fun getIsGuildMember(): String? {
        return isGuildMember
    }

    fun setIsGuildMember(isGuildMember: String) {
        this.isGuildMember = isGuildMember
    }

    fun getGuildMembershipNumber(): String? {
        return guildMembershipNumber
    }

    fun setGuildMembershipNumber(guildMembershipNumber: String) {
        this.guildMembershipNumber = guildMembershipNumber
    }

    fun getContactDetails(): String? {
        return contactDetails
    }

    fun setContactDetails(contactDetails: String) {
        this.contactDetails = contactDetails
    }

    fun getCity(): String? {
        return city
    }

    fun setCity(city: String) {
        this.city = city
    }

    fun getState(): String? {
        return state
    }

    fun setState(state: String) {
        this.state = state
    }

    fun getPostalCode(): String? {
        return postalCode
    }

    fun setPostalCode(postalCode: String) {
        this.postalCode = postalCode
    }

    fun getOpeningDaysHours(): String? {
        return openingDaysHours
    }

    fun setOpeningDaysHours(openingDaysHours: String) {
        this.openingDaysHours = openingDaysHours
    }

    fun getOpeningTime(): String? {
        return openingTime
    }

    fun setOpeningTime(openingTime: String) {
        this.openingTime = openingTime
    }

    fun getClosingTime(): String? {
        return closingTime
    }

    fun setClosingTime(closingTime: String) {
        this.closingTime = closingTime
    }

    fun getSalonLogo(): String? {
        return salonLogo
    }

    fun setSalonLogo(salonLogo: String) {
        this.salonLogo = salonLogo
    }

    fun getSalonLogoPath(): String? {
        return salonLogoPath
    }

    fun setSalonLogoPath(salonLogoPath: String) {
        this.salonLogoPath = salonLogoPath
    }

    fun getSalonDescription(): String? {
        return salonDescription
    }

    fun setSalonDescription(salonDescription: String) {
        this.salonDescription = salonDescription
    }

    fun getOwnerPicture(): Any? {
        return ownerPicture
    }

    fun setOwnerPicture(ownerPicture: Any) {
        this.ownerPicture = ownerPicture
    }

    fun getBrandingPicture1(): Any? {
        return brandingPicture1
    }

    fun setBrandingPicture1(brandingPicture1: Any) {
        this.brandingPicture1 = brandingPicture1
    }

    fun getBrandingPicture2(): Any? {
        return brandingPicture2
    }

    fun setBrandingPicture2(brandingPicture2: Any) {
        this.brandingPicture2 = brandingPicture2
    }

    fun getBookingTermsConditions(): String? {
        return bookingTermsConditions
    }

    fun setBookingTermsConditions(bookingTermsConditions: String) {
        this.bookingTermsConditions = bookingTermsConditions
    }

    fun getCancellationPolicy(): String? {
        return cancellationPolicy
    }

    fun setCancellationPolicy(cancellationPolicy: String) {
        this.cancellationPolicy = cancellationPolicy
    }

    fun getSalonStatus(): String? {
        return salonStatus
    }

    fun setSalonStatus(salonStatus: String) {
        this.salonStatus = salonStatus
    }

    fun getCreatedDate(): String? {
        return createdDate
    }

    fun setCreatedDate(createdDate: String) {
        this.createdDate = createdDate
    }

    fun getModifiedDate(): String? {
        return modifiedDate
    }

    fun setModifiedDate(modifiedDate: String) {
        this.modifiedDate = modifiedDate
    }

    fun getGuildExpiredDate(): String? {
        return guildExpiredDate
    }

    fun setGuildExpiredDate(guildExpiredDate: String) {
        this.guildExpiredDate = guildExpiredDate
    }

    fun getModifiedBy(): String? {
        return modifiedBy
    }

    fun setModifiedBy(modifiedBy: String) {
        this.modifiedBy = modifiedBy
    }

    fun getSalonName(): String? {
        return salonName
    }

    fun setSalonName(salonName: String) {
        this.salonName = salonName
    }

    fun getSalonId(): Int? {
        return salonId
    }

    fun setSalonId(salonId: Int?) {
        this.salonId = salonId
    }

    fun getClosingDay(): String? {
        return closingDay
    }

    fun setClosingDay(closingDay: String) {
        this.closingDay = closingDay
    }
}