package com.employers.claimsproclient.dto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;


public class ClaimDTO implements Serializable {

    private Integer claim_no;
    private String claimId;
    private String last_name;
    private String first_name;
    private String desk_id;
    private String extinj;
    private String emp_status;
    private String losscov;
    private String clm_status;
    private String clm_type;
    private String branch;
    private String addr;
    private String city;
    private String st;
    private String zip;
    private String phone;
    private Integer policy_no;
    private Integer policy_seq;
    private String policy_loc;
    private String pol_contact;
    private String pol_phone;
    private String cat_code;
    private String source_know;
    private String ssn;
    private String sex;
    private String location;
    private String department;
    private String jurst;
    private String payst;
    private String settlement;
    private String claim_class;
    private String class_sfx;
    private String accdesc;
    private String injdesc;
    private String occupation;
    private String diagnosis;
    private String second_diag;
    private String acc_source;
    private String acc_part;
    private String acc_type;
    private String acc_site;
    private String master_sub_el;
    private String surgery;
    private String salsub;
    private String rein;
    private String rehab;
    private String lit_status;
    private String aoecoe;
    private String salcon;
    private String wperpaid;
    private String wage_loss;
    private String hospitalized;
    private LocalDate ct_from_dt;
    private LocalDate ct_thru_dt;
    private Integer wkwage;
    private Integer pd_paylimit;
    private Integer pd_percent;
    private LocalDate aoecoe_due_dt;
    private LocalDate injury_dt;
    private LocalDate cov_deny_dt;
    private LocalDate cov_delay_dt;
    private LocalDate cov_accepted_dt;
    private LocalDate hire_dt;
    private LocalDate report_dt;
    private LocalDate birth_dt;
    private LocalDate insured_know_dt;
    private LocalDate carrier_know_dt;
    private LocalDate empform_dt;
    private LocalDate mo_ind_dt;
    private LocalDate rrtn_dt;
    private LocalDate rtnwk_dt;
    private LocalDate rtnmod_dt;
    private LocalDate firstoff_dt;
    private LocalDate wait_from_dt;
    private LocalDate wait_thru_dt;
    private LocalDate perm_stat_dt;
    private LocalDate death_dt;
    private LocalDate reopen_dt;
    private LocalDate close_dt;
    private Integer joint_pct;
    private String marital_status;
    private String brokenwp;
    private String state_id;
    private String work_type;
    private String nurse;
    private LocalDate nurse_dt;
    private String pay_alert_msg;
    private String primary_dr;
    private String primary_dr_no;
    private Integer primary_dr_loc;
    private LocalDate pdsp_from_dt;
    private LocalDate pdsp_thru_dt;
    private String federal_cd;
    private Integer lec_rate;
    private Integer lp_alt_rate;
    private Integer td_alt_rate;
    private Integer pd_alt_rate;
    private Integer vr_alt_rate;
    private String fraud_referral;
    private LocalDate timestamp;
    private Integer fraud_inc_amount;
    private String fraud_type;
    private Integer dom;
    private String managed_care_type;
    private String ben_pay_status;
    private Integer db_rate;
    private String commutation;
    private String mo_ind;
    private Integer policy_loc_seq;
    private LocalDate setup_dt;
    private Integer user_extinj;
    private Integer user_loss_cov;
    private String seasonal;
    private String rein_type;
    private LocalDate rein_dt;
    private LocalDate rein_report_dt;
    private String wage_method;
    private String deductible;
    private Integer wkwage_other;
    private String acc_state;
    private Integer ss_offset_amt;
    private Integer ls_rem_amt;
    private Integer settlement_amt;
    private String exting_alt;
    private String losscov_alt;
    private String lead_carrier;

    public Integer getClaim_no() {
        return claim_no;
    }

    public void setClaim_no(Integer claim_no) {
        this.claim_no = claim_no;
    }

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getDesk_id() {
        return desk_id;
    }

    public void setDesk_id(String desk_id) {
        this.desk_id = desk_id;
    }

    public String getExtinj() {
        return extinj;
    }

    public void setExtinj(String extinj) {
        this.extinj = extinj;
    }

    public String getEmp_status() {
        return emp_status;
    }

    public void setEmp_status(String emp_status) {
        this.emp_status = emp_status;
    }

    public String getLosscov() {
        return losscov;
    }

    public void setLosscov(String losscov) {
        this.losscov = losscov;
    }

    public String getClm_status() {
        return clm_status;
    }

    public void setClm_status(String clm_status) {
        this.clm_status = clm_status;
    }

    public String getClm_type() {
        return clm_type;
    }

    public void setClm_type(String clm_type) {
        this.clm_type = clm_type;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getPolicy_no() {
        return policy_no;
    }

    public void setPolicy_no(Integer policy_no) {
        this.policy_no = policy_no;
    }

    public Integer getPolicy_seq() {
        return policy_seq;
    }

    public void setPolicy_seq(Integer policy_seq) {
        this.policy_seq = policy_seq;
    }

    public String getPolicy_loc() {
        return policy_loc;
    }

    public void setPolicy_loc(String policy_loc) {
        this.policy_loc = policy_loc;
    }

    public String getPol_contact() {
        return pol_contact;
    }

    public void setPol_contact(String pol_contact) {
        this.pol_contact = pol_contact;
    }

    public String getPol_phone() {
        return pol_phone;
    }

    public void setPol_phone(String pol_phone) {
        this.pol_phone = pol_phone;
    }

    public String getCat_code() {
        return cat_code;
    }

    public void setCat_code(String cat_code) {
        this.cat_code = cat_code;
    }

    public String getSource_know() {
        return source_know;
    }

    public void setSource_know(String source_know) {
        this.source_know = source_know;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJurst() {
        return jurst;
    }

    public void setJurst(String jurst) {
        this.jurst = jurst;
    }

    public String getPayst() {
        return payst;
    }

    public void setPayst(String payst) {
        this.payst = payst;
    }

    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }

    public String getClaim_class() {
        return claim_class;
    }

    public void setClaim_class(String claim_class) {
        this.claim_class = claim_class;
    }

    public String getClass_sfx() {
        return class_sfx;
    }

    public void setClass_sfx(String class_sfx) {
        this.class_sfx = class_sfx;
    }

    public String getAccdesc() {
        return accdesc;
    }

    public void setAccdesc(String accdesc) {
        this.accdesc = accdesc;
    }

    public String getInjdesc() {
        return injdesc;
    }

    public void setInjdesc(String injdesc) {
        this.injdesc = injdesc;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getSecond_diag() {
        return second_diag;
    }

    public void setSecond_diag(String second_diag) {
        this.second_diag = second_diag;
    }

    public String getAcc_source() {
        return acc_source;
    }

    public void setAcc_source(String acc_source) {
        this.acc_source = acc_source;
    }

    public String getAcc_part() {
        return acc_part;
    }

    public void setAcc_part(String acc_part) {
        this.acc_part = acc_part;
    }

    public String getAcc_type() {
        return acc_type;
    }

    public void setAcc_type(String acc_type) {
        this.acc_type = acc_type;
    }

    public String getAcc_site() {
        return acc_site;
    }

    public void setAcc_site(String acc_site) {
        this.acc_site = acc_site;
    }

    public String getMaster_sub_el() {
        return master_sub_el;
    }

    public void setMaster_sub_el(String master_sub_el) {
        this.master_sub_el = master_sub_el;
    }

    public String getSurgery() {
        return surgery;
    }

    public void setSurgery(String surgery) {
        this.surgery = surgery;
    }

    public String getSalsub() {
        return salsub;
    }

    public void setSalsub(String salsub) {
        this.salsub = salsub;
    }

    public String getRein() {
        return rein;
    }

    public void setRein(String rein) {
        this.rein = rein;
    }

    public String getRehab() {
        return rehab;
    }

    public void setRehab(String rehab) {
        this.rehab = rehab;
    }

    public String getLit_status() {
        return lit_status;
    }

    public void setLit_status(String lit_status) {
        this.lit_status = lit_status;
    }

    public String getAoecoe() {
        return aoecoe;
    }

    public void setAoecoe(String aoecoe) {
        this.aoecoe = aoecoe;
    }

    public String getSalcon() {
        return salcon;
    }

    public void setSalcon(String salcon) {
        this.salcon = salcon;
    }

    public String getWperpaid() {
        return wperpaid;
    }

    public void setWperpaid(String wperpaid) {
        this.wperpaid = wperpaid;
    }

    public String getWage_loss() {
        return wage_loss;
    }

    public void setWage_loss(String wage_loss) {
        this.wage_loss = wage_loss;
    }

    public String getHospitalized() {
        return hospitalized;
    }

    public void setHospitalized(String hospitalized) {
        this.hospitalized = hospitalized;
    }

    public LocalDate getCt_from_dt() {
        return ct_from_dt;
    }

    public void setCt_from_dt(LocalDate ct_from_dt) {
        this.ct_from_dt = ct_from_dt;
    }

    public LocalDate getCt_thru_dt() {
        return ct_thru_dt;
    }

    public void setCt_thru_dt(LocalDate ct_thru_dt) {
        this.ct_thru_dt = ct_thru_dt;
    }

    public Integer getWkwage() {
        return wkwage;
    }

    public void setWkwage(Integer wkwage) {
        this.wkwage = wkwage;
    }

    public Integer getPd_paylimit() {
        return pd_paylimit;
    }

    public void setPd_paylimit(Integer pd_paylimit) {
        this.pd_paylimit = pd_paylimit;
    }

    public Integer getPd_percent() {
        return pd_percent;
    }

    public void setPd_percent(Integer pd_percent) {
        this.pd_percent = pd_percent;
    }

    public LocalDate getAoecoe_due_dt() {
        return aoecoe_due_dt;
    }

    public void setAoecoe_due_dt(LocalDate aoecoe_due_dt) {
        this.aoecoe_due_dt = aoecoe_due_dt;
    }

    public LocalDate getInjury_dt() {
        return injury_dt;
    }

    public void setInjury_dt(LocalDate injury_dt) {
        this.injury_dt = injury_dt;
    }

    public LocalDate getCov_deny_dt() {
        return cov_deny_dt;
    }

    public void setCov_deny_dt(LocalDate cov_deny_dt) {
        this.cov_deny_dt = cov_deny_dt;
    }

    public LocalDate getCov_delay_dt() {
        return cov_delay_dt;
    }

    public void setCov_delay_dt(LocalDate cov_delay_dt) {
        this.cov_delay_dt = cov_delay_dt;
    }

    public LocalDate getCov_accepted_dt() {
        return cov_accepted_dt;
    }

    public void setCov_accepted_dt(LocalDate cov_accepted_dt) {
        this.cov_accepted_dt = cov_accepted_dt;
    }

    public LocalDate getHire_dt() {
        return hire_dt;
    }

    public void setHire_dt(LocalDate hire_dt) {
        this.hire_dt = hire_dt;
    }

    public LocalDate getReport_dt() {
        return report_dt;
    }

    public void setReport_dt(LocalDate report_dt) {
        this.report_dt = report_dt;
    }

    public LocalDate getBirth_dt() {
        return birth_dt;
    }

    public void setBirth_dt(LocalDate birth_dt) {
        this.birth_dt = birth_dt;
    }

    public LocalDate getInsured_know_dt() {
        return insured_know_dt;
    }

    public void setInsured_know_dt(LocalDate insured_know_dt) {
        this.insured_know_dt = insured_know_dt;
    }

    public LocalDate getCarrier_know_dt() {
        return carrier_know_dt;
    }

    public void setCarrier_know_dt(LocalDate carrier_know_dt) {
        this.carrier_know_dt = carrier_know_dt;
    }

    public LocalDate getEmpform_dt() {
        return empform_dt;
    }

    public void setEmpform_dt(LocalDate empform_dt) {
        this.empform_dt = empform_dt;
    }

    public LocalDate getMo_ind_dt() {
        return mo_ind_dt;
    }

    public void setMo_ind_dt(LocalDate mo_ind_dt) {
        this.mo_ind_dt = mo_ind_dt;
    }

    public LocalDate getRrtn_dt() {
        return rrtn_dt;
    }

    public void setRrtn_dt(LocalDate rrtn_dt) {
        this.rrtn_dt = rrtn_dt;
    }

    public LocalDate getRtnwk_dt() {
        return rtnwk_dt;
    }

    public void setRtnwk_dt(LocalDate rtnwk_dt) {
        this.rtnwk_dt = rtnwk_dt;
    }

    public LocalDate getRtnmod_dt() {
        return rtnmod_dt;
    }

    public void setRtnmod_dt(LocalDate rtnmod_dt) {
        this.rtnmod_dt = rtnmod_dt;
    }

    public LocalDate getFirstoff_dt() {
        return firstoff_dt;
    }

    public void setFirstoff_dt(LocalDate firstoff_dt) {
        this.firstoff_dt = firstoff_dt;
    }

    public LocalDate getWait_from_dt() {
        return wait_from_dt;
    }

    public void setWait_from_dt(LocalDate wait_from_dt) {
        this.wait_from_dt = wait_from_dt;
    }

    public LocalDate getWait_thru_dt() {
        return wait_thru_dt;
    }

    public void setWait_thru_dt(LocalDate wait_thru_dt) {
        this.wait_thru_dt = wait_thru_dt;
    }

    public LocalDate getPerm_stat_dt() {
        return perm_stat_dt;
    }

    public void setPerm_stat_dt(LocalDate perm_stat_dt) {
        this.perm_stat_dt = perm_stat_dt;
    }

    public LocalDate getDeath_dt() {
        return death_dt;
    }

    public void setDeath_dt(LocalDate death_dt) {
        this.death_dt = death_dt;
    }

    public LocalDate getReopen_dt() {
        return reopen_dt;
    }

    public void setReopen_dt(LocalDate reopen_dt) {
        this.reopen_dt = reopen_dt;
    }

    public LocalDate getClose_dt() {
        return close_dt;
    }

    public void setClose_dt(LocalDate close_dt) {
        this.close_dt = close_dt;
    }

    public Integer getJoint_pct() {
        return joint_pct;
    }

    public void setJoint_pct(Integer joint_pct) {
        this.joint_pct = joint_pct;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    public String getBrokenwp() {
        return brokenwp;
    }

    public void setBrokenwp(String brokenwp) {
        this.brokenwp = brokenwp;
    }

    public String getState_id() {
        return state_id;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
    }

    public String getWork_type() {
        return work_type;
    }

    public void setWork_type(String work_type) {
        this.work_type = work_type;
    }

    public String getNurse() {
        return nurse;
    }

    public void setNurse(String nurse) {
        this.nurse = nurse;
    }

    public LocalDate getNurse_dt() {
        return nurse_dt;
    }

    public void setNurse_dt(LocalDate nurse_dt) {
        this.nurse_dt = nurse_dt;
    }

    public String getPay_alert_msg() {
        return pay_alert_msg;
    }

    public void setPay_alert_msg(String pay_alert_msg) {
        this.pay_alert_msg = pay_alert_msg;
    }

    public String getPrimary_dr() {
        return primary_dr;
    }

    public void setPrimary_dr(String primary_dr) {
        this.primary_dr = primary_dr;
    }

    public String getPrimary_dr_no() {
        return primary_dr_no;
    }

    public void setPrimary_dr_no(String primary_dr_no) {
        this.primary_dr_no = primary_dr_no;
    }

    public Integer getPrimary_dr_loc() {
        return primary_dr_loc;
    }

    public void setPrimary_dr_loc(Integer primary_dr_loc) {
        this.primary_dr_loc = primary_dr_loc;
    }

    public LocalDate getPdsp_from_dt() {
        return pdsp_from_dt;
    }

    public void setPdsp_from_dt(LocalDate pdsp_from_dt) {
        this.pdsp_from_dt = pdsp_from_dt;
    }

    public LocalDate getPdsp_thru_dt() {
        return pdsp_thru_dt;
    }

    public void setPdsp_thru_dt(LocalDate pdsp_thru_dt) {
        this.pdsp_thru_dt = pdsp_thru_dt;
    }

    public String getFederal_cd() {
        return federal_cd;
    }

    public void setFederal_cd(String federal_cd) {
        this.federal_cd = federal_cd;
    }

    public Integer getLec_rate() {
        return lec_rate;
    }

    public void setLec_rate(Integer lec_rate) {
        this.lec_rate = lec_rate;
    }

    public Integer getLp_alt_rate() {
        return lp_alt_rate;
    }

    public void setLp_alt_rate(Integer lp_alt_rate) {
        this.lp_alt_rate = lp_alt_rate;
    }

    public Integer getTd_alt_rate() {
        return td_alt_rate;
    }

    public void setTd_alt_rate(Integer td_alt_rate) {
        this.td_alt_rate = td_alt_rate;
    }

    public Integer getPd_alt_rate() {
        return pd_alt_rate;
    }

    public void setPd_alt_rate(Integer pd_alt_rate) {
        this.pd_alt_rate = pd_alt_rate;
    }

    public Integer getVr_alt_rate() {
        return vr_alt_rate;
    }

    public void setVr_alt_rate(Integer vr_alt_rate) {
        this.vr_alt_rate = vr_alt_rate;
    }

    public String getFraud_referral() {
        return fraud_referral;
    }

    public void setFraud_referral(String fraud_referral) {
        this.fraud_referral = fraud_referral;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getFraud_inc_amount() {
        return fraud_inc_amount;
    }

    public void setFraud_inc_amount(Integer fraud_inc_amount) {
        this.fraud_inc_amount = fraud_inc_amount;
    }

    public String getFraud_type() {
        return fraud_type;
    }

    public void setFraud_type(String fraud_type) {
        this.fraud_type = fraud_type;
    }

    public Integer getDom() {
        return dom;
    }

    public void setDom(Integer dom) {
        this.dom = dom;
    }

    public String getManaged_care_type() {
        return managed_care_type;
    }

    public void setManaged_care_type(String managed_care_type) {
        this.managed_care_type = managed_care_type;
    }

    public String getBen_pay_status() {
        return ben_pay_status;
    }

    public void setBen_pay_status(String ben_pay_status) {
        this.ben_pay_status = ben_pay_status;
    }

    public Integer getDb_rate() {
        return db_rate;
    }

    public void setDb_rate(Integer db_rate) {
        this.db_rate = db_rate;
    }

    public String getCommutation() {
        return commutation;
    }

    public void setCommutation(String commutation) {
        this.commutation = commutation;
    }

    public String getMo_ind() {
        return mo_ind;
    }

    public void setMo_ind(String mo_ind) {
        this.mo_ind = mo_ind;
    }

    public Integer getPolicy_loc_seq() {
        return policy_loc_seq;
    }

    public void setPolicy_loc_seq(Integer policy_loc_seq) {
        this.policy_loc_seq = policy_loc_seq;
    }

    public LocalDate getSetup_dt() {
        return setup_dt;
    }

    public void setSetup_dt(LocalDate setup_dt) {
        this.setup_dt = setup_dt;
    }

    public Integer getUser_extinj() {
        return user_extinj;
    }

    public void setUser_extinj(Integer user_extinj) {
        this.user_extinj = user_extinj;
    }

    public Integer getUser_loss_cov() {
        return user_loss_cov;
    }

    public void setUser_loss_cov(Integer user_loss_cov) {
        this.user_loss_cov = user_loss_cov;
    }

    public String getSeasonal() {
        return seasonal;
    }

    public void setSeasonal(String seasonal) {
        this.seasonal = seasonal;
    }

    public String getRein_type() {
        return rein_type;
    }

    public void setRein_type(String rein_type) {
        this.rein_type = rein_type;
    }

    public LocalDate getRein_dt() {
        return rein_dt;
    }

    public void setRein_dt(LocalDate rein_dt) {
        this.rein_dt = rein_dt;
    }

    public LocalDate getRein_report_dt() {
        return rein_report_dt;
    }

    public void setRein_report_dt(LocalDate rein_report_dt) {
        this.rein_report_dt = rein_report_dt;
    }

    public String getWage_method() {
        return wage_method;
    }

    public void setWage_method(String wage_method) {
        this.wage_method = wage_method;
    }

    public String getDeductible() {
        return deductible;
    }

    public void setDeductible(String deductible) {
        this.deductible = deductible;
    }

    public Integer getWkwage_other() {
        return wkwage_other;
    }

    public void setWkwage_other(Integer wkwage_other) {
        this.wkwage_other = wkwage_other;
    }

    public String getAcc_state() {
        return acc_state;
    }

    public void setAcc_state(String acc_state) {
        this.acc_state = acc_state;
    }

    public Integer getSs_offset_amt() {
        return ss_offset_amt;
    }

    public void setSs_offset_amt(Integer ss_offset_amt) {
        this.ss_offset_amt = ss_offset_amt;
    }

    public Integer getLs_rem_amt() {
        return ls_rem_amt;
    }

    public void setLs_rem_amt(Integer ls_rem_amt) {
        this.ls_rem_amt = ls_rem_amt;
    }

    public Integer getSettlement_amt() {
        return settlement_amt;
    }

    public void setSettlement_amt(Integer settlement_amt) {
        this.settlement_amt = settlement_amt;
    }

    public String getExting_alt() {
        return exting_alt;
    }

    public void setExting_alt(String exting_alt) {
        this.exting_alt = exting_alt;
    }

    public String getLosscov_alt() {
        return losscov_alt;
    }

    public void setLosscov_alt(String losscov_alt) {
        this.losscov_alt = losscov_alt;
    }

    public String getLead_carrier() {
        return lead_carrier;
    }

    public void setLead_carrier(String lead_carrier) {
        this.lead_carrier = lead_carrier;
    }
}
