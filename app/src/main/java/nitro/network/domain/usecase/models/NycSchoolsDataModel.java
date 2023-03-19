package nitro.network.domain.usecase.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.squareup.moshi.JsonClass;

import java.io.Serializable;

//@JsonClass(generateAdapter = true)
public class NycSchoolsDataModel/* implements Serializable */{

    @SerializedName("dbn")
    @Expose
    public String dbn;
    @SerializedName("school_name")
    @Expose
    public String schoolName;
    @SerializedName("boro")
    @Expose
    public String boro;
    @SerializedName("overview_paragraph")
    @Expose
    public String overviewParagraph;
    @SerializedName("school_10th_seats")
    @Expose
    public String school10thSeats;
    @SerializedName("academicopportunities1")
    @Expose
    public String academicopportunities1;
    @SerializedName("academicopportunities2")
    @Expose
    public String academicopportunities2;
    @SerializedName("ell_programs")
    @Expose
    public String ellPrograms;
    @SerializedName("neighborhood")
    @Expose
    public String neighborhood;
    @SerializedName("building_code")
    @Expose
    public String buildingCode;
    @SerializedName("location")
    @Expose
    public String location;
    @SerializedName("phone_number")
    @Expose
    public String phoneNumber;
    @SerializedName("fax_number")
    @Expose
    public String faxNumber;
    @SerializedName("school_email")
    @Expose
    public String schoolEmail;
    @SerializedName("website")
    @Expose
    public String website;
    @SerializedName("subway")
    @Expose
    public String subway;
    @SerializedName("bus")
    @Expose
    public String bus;
    @SerializedName("grades2018")
    @Expose
    public String grades2018;
    @SerializedName("finalgrades")
    @Expose
    public String finalgrades;
    @SerializedName("total_students")
    @Expose
    public String totalStudents;
    @SerializedName("extracurricular_activities")
    @Expose
    public String extracurricularActivities;
    @SerializedName("school_sports")
    @Expose
    public String schoolSports;
    @SerializedName("attendance_rate")
    @Expose
    public String attendanceRate;
    @SerializedName("pct_stu_enough_variety")
    @Expose
    public String pctStuEnoughVariety;
    @SerializedName("pct_stu_safe")
    @Expose
    public String pctStuSafe;
    @SerializedName("school_accessibility_description")
    @Expose
    public String schoolAccessibilityDescription;
    @SerializedName("directions1")
    @Expose
    public String directions1;
    @SerializedName("requirement1_1")
    @Expose
    public String requirement11;
    @SerializedName("requirement2_1")
    @Expose
    public String requirement21;
    @SerializedName("requirement3_1")
    @Expose
    public String requirement31;
    @SerializedName("requirement4_1")
    @Expose
    public String requirement41;
    @SerializedName("requirement5_1")
    @Expose
    public String requirement51;
    @SerializedName("offer_rate1")
    @Expose
    public String offerRate1;
    @SerializedName("program1")
    @Expose
    public String program1;
    @SerializedName("code1")
    @Expose
    public String code1;
    @SerializedName("interest1")
    @Expose
    public String interest1;
    @SerializedName("method1")
    @Expose
    public String method1;
    @SerializedName("seats9ge1")
    @Expose
    public String seats9ge1;
    @SerializedName("grade9gefilledflag1")
    @Expose
    public String grade9gefilledflag1;
    @SerializedName("grade9geapplicants1")
    @Expose
    public String grade9geapplicants1;
    @SerializedName("seats9swd1")
    @Expose
    public String seats9swd1;
    @SerializedName("grade9swdfilledflag1")
    @Expose
    public String grade9swdfilledflag1;
    @SerializedName("grade9swdapplicants1")
    @Expose
    public String grade9swdapplicants1;
    @SerializedName("seats101")
    @Expose
    public String seats101;
    @SerializedName("admissionspriority11")
    @Expose
    public String admissionspriority11;
    @SerializedName("admissionspriority21")
    @Expose
    public String admissionspriority21;
    @SerializedName("admissionspriority31")
    @Expose
    public String admissionspriority31;
    @SerializedName("grade9geapplicantsperseat1")
    @Expose
    public String grade9geapplicantsperseat1;
    @SerializedName("grade9swdapplicantsperseat1")
    @Expose
    public String grade9swdapplicantsperseat1;
    @SerializedName("primary_address_line_1")
    @Expose
    public String primaryAddressLine1;
    @SerializedName("city")
    @Expose
    public String city;
    @SerializedName("zip")
    @Expose
    public String zip;
    @SerializedName("state_code")
    @Expose
    public String stateCode;
    @SerializedName("latitude")
    @Expose
    public String latitude;
    @SerializedName("longitude")
    @Expose
    public String longitude;
    @SerializedName("community_board")
    @Expose
    public String communityBoard;
    @SerializedName("council_district")
    @Expose
    public String councilDistrict;
    @SerializedName("census_tract")
    @Expose
    public String censusTract;
    @SerializedName("bin")
    @Expose
    public String bin;
    @SerializedName("bbl")
    @Expose
    public String bbl;
    @SerializedName("nta")
    @Expose
    public String nta;
    @SerializedName("borough")
    @Expose
    public String borough;
    @SerializedName("academicopportunities3")
    @Expose
    public String academicopportunities3;
    @SerializedName("language_classes")
    @Expose
    public String languageClasses;
    @SerializedName("addtl_info1")
    @Expose
    public String addtlInfo1;
    @SerializedName("transfer")
    @Expose
    public String transfer;
    @SerializedName("eligibility1")
    @Expose
    public String eligibility1;

}