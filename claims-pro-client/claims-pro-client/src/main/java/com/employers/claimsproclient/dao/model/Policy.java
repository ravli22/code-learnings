package com.employers.claimsproclient.dao.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Policy {

    @Id
    private String policy_no;
    private int batch_id;
    private int record_id;
    private String policy_seq;
    private String update_code;
    private String insured_name;
    private String insured_address1;
    private String insured_address2;
    private String insured_city;
    private String insured_state;
    private String insured_zip;
    private String insured_phone;
    private String insured_fax;
    private String insured_email;
    private String insured_fed_id;
    private String entity;
    private String audit_location;
    private String audit_contact;
    private String audit_address1;
    private String audit_address2;
    private String audit_city;
    private String audit_state;
    private String audit_zip;
    private String audit_phone;
    private String audit_fax;
    private String audit_county;
    private String audit_start_date;
    private String audit_end_date;
    private String audit_type;
    private String audit_source_code;
    private String policy_number;
    private String policy_type;
    private String policy_type_label;
    private String policy_ins_co;
    private String policy_start_date;
    private String policy_end_date;
    private String policy_code;
    private String policy_est_premium;
    private String agent_name;
    private String agent_contact_name;
    private String agent_address1;
    private String agent_address2;
    private String agent_city;
    private String agent_state;
    private String agent_zip;
    private String agent_phone;
    private String agent_fax;
    private String agent_email;
    private String serial_number;
    private String priority;
    private String is_correction;
    private String is_non_productive;
    private String user_flags;
    private String parent_name;
    private String assign_code;
    private String child_name;
    private String child_grp_code;
    private String uq_insured_name;
    private String uq_policy_number;
    private String uq_policy_type;
    private String uq_policy_end_date;
    private String uq_policy_ins_co;
    private String uq_policy_code;
    private String uq_serial_num;
    private String uq_audit_type;
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;
    private String attribute5;
    private String attribute6;
    private String attribute7;
    private String attribute8;
    private String attribute9;
    private String attribute10;
    private LocalDate creation_date;
    private String created_by;
    private LocalDate last_update_date;
    private String last_updated_by;


    public int getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(int batch_id) {
        this.batch_id = batch_id;
    }

    public int getRecord_id() {
        return record_id;
    }

    public void setRecord_id(int record_id) {
        this.record_id = record_id;
    }

    public String getPolicy_no() {
        return policy_no;
    }

    public void setPolicy_no(String policy_no) {
        this.policy_no = policy_no;
    }

    public String getPolicy_seq() {
        return policy_seq;
    }

    public void setPolicy_seq(String policy_seq) {
        this.policy_seq = policy_seq;
    }

    public String getUpdate_code() {
        return update_code;
    }

    public void setUpdate_code(String update_code) {
        this.update_code = update_code;
    }

    public String getInsured_name() {
        return insured_name;
    }

    public void setInsured_name(String insured_name) {
        this.insured_name = insured_name;
    }

    public String getInsured_address1() {
        return insured_address1;
    }

    public void setInsured_address1(String insured_address1) {
        this.insured_address1 = insured_address1;
    }

    public String getInsured_address2() {
        return insured_address2;
    }

    public void setInsured_address2(String insured_address2) {
        this.insured_address2 = insured_address2;
    }

    public String getInsured_city() {
        return insured_city;
    }

    public void setInsured_city(String insured_city) {
        this.insured_city = insured_city;
    }

    public String getInsured_state() {
        return insured_state;
    }

    public void setInsured_state(String insured_state) {
        this.insured_state = insured_state;
    }

    public String getInsured_zip() {
        return insured_zip;
    }

    public void setInsured_zip(String insured_zip) {
        this.insured_zip = insured_zip;
    }

    public String getInsured_phone() {
        return insured_phone;
    }

    public void setInsured_phone(String insured_phone) {
        this.insured_phone = insured_phone;
    }

    public String getInsured_fax() {
        return insured_fax;
    }

    public void setInsured_fax(String insured_fax) {
        this.insured_fax = insured_fax;
    }

    public String getInsured_email() {
        return insured_email;
    }

    public void setInsured_email(String insured_email) {
        this.insured_email = insured_email;
    }

    public String getInsured_fed_id() {
        return insured_fed_id;
    }

    public void setInsured_fed_id(String insured_fed_id) {
        this.insured_fed_id = insured_fed_id;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getAudit_location() {
        return audit_location;
    }

    public void setAudit_location(String audit_location) {
        this.audit_location = audit_location;
    }

    public String getAudit_contact() {
        return audit_contact;
    }

    public void setAudit_contact(String audit_contact) {
        this.audit_contact = audit_contact;
    }

    public String getAudit_address1() {
        return audit_address1;
    }

    public void setAudit_address1(String audit_address1) {
        this.audit_address1 = audit_address1;
    }

    public String getAudit_address2() {
        return audit_address2;
    }

    public void setAudit_address2(String audit_address2) {
        this.audit_address2 = audit_address2;
    }

    public String getAudit_city() {
        return audit_city;
    }

    public void setAudit_city(String audit_city) {
        this.audit_city = audit_city;
    }

    public String getAudit_state() {
        return audit_state;
    }

    public void setAudit_state(String audit_state) {
        this.audit_state = audit_state;
    }

    public String getAudit_zip() {
        return audit_zip;
    }

    public void setAudit_zip(String audit_zip) {
        this.audit_zip = audit_zip;
    }

    public String getAudit_phone() {
        return audit_phone;
    }

    public void setAudit_phone(String audit_phone) {
        this.audit_phone = audit_phone;
    }

    public String getAudit_fax() {
        return audit_fax;
    }

    public void setAudit_fax(String audit_fax) {
        this.audit_fax = audit_fax;
    }

    public String getAudit_county() {
        return audit_county;
    }

    public void setAudit_county(String audit_county) {
        this.audit_county = audit_county;
    }

    public String getAudit_start_date() {
        return audit_start_date;
    }

    public void setAudit_start_date(String audit_start_date) {
        this.audit_start_date = audit_start_date;
    }

    public String getAudit_end_date() {
        return audit_end_date;
    }

    public void setAudit_end_date(String audit_end_date) {
        this.audit_end_date = audit_end_date;
    }

    public String getAudit_type() {
        return audit_type;
    }

    public void setAudit_type(String audit_type) {
        this.audit_type = audit_type;
    }

    public String getAudit_source_code() {
        return audit_source_code;
    }

    public void setAudit_source_code(String audit_source_code) {
        this.audit_source_code = audit_source_code;
    }

    public String getPolicy_number() {
        return policy_number;
    }

    public void setPolicy_number(String policy_number) {
        this.policy_number = policy_number;
    }

    public String getPolicy_type() {
        return policy_type;
    }

    public void setPolicy_type(String policy_type) {
        this.policy_type = policy_type;
    }

    public String getPolicy_type_label() {
        return policy_type_label;
    }

    public void setPolicy_type_label(String policy_type_label) {
        this.policy_type_label = policy_type_label;
    }

    public String getPolicy_ins_co() {
        return policy_ins_co;
    }

    public void setPolicy_ins_co(String policy_ins_co) {
        this.policy_ins_co = policy_ins_co;
    }

    public String getPolicy_start_date() {
        return policy_start_date;
    }

    public void setPolicy_start_date(String policy_start_date) {
        this.policy_start_date = policy_start_date;
    }

    public String getPolicy_end_date() {
        return policy_end_date;
    }

    public void setPolicy_end_date(String policy_end_date) {
        this.policy_end_date = policy_end_date;
    }

    public String getPolicy_code() {
        return policy_code;
    }

    public void setPolicy_code(String policy_code) {
        this.policy_code = policy_code;
    }

    public String getPolicy_est_premium() {
        return policy_est_premium;
    }

    public void setPolicy_est_premium(String policy_est_premium) {
        this.policy_est_premium = policy_est_premium;
    }

    public String getAgent_name() {
        return agent_name;
    }

    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name;
    }

    public String getAgent_contact_name() {
        return agent_contact_name;
    }

    public void setAgent_contact_name(String agent_contact_name) {
        this.agent_contact_name = agent_contact_name;
    }

    public String getAgent_address1() {
        return agent_address1;
    }

    public void setAgent_address1(String agent_address1) {
        this.agent_address1 = agent_address1;
    }

    public String getAgent_address2() {
        return agent_address2;
    }

    public void setAgent_address2(String agent_address2) {
        this.agent_address2 = agent_address2;
    }

    public String getAgent_city() {
        return agent_city;
    }

    public void setAgent_city(String agent_city) {
        this.agent_city = agent_city;
    }

    public String getAgent_state() {
        return agent_state;
    }

    public void setAgent_state(String agent_state) {
        this.agent_state = agent_state;
    }

    public String getAgent_zip() {
        return agent_zip;
    }

    public void setAgent_zip(String agent_zip) {
        this.agent_zip = agent_zip;
    }

    public String getAgent_phone() {
        return agent_phone;
    }

    public void setAgent_phone(String agent_phone) {
        this.agent_phone = agent_phone;
    }

    public String getAgent_fax() {
        return agent_fax;
    }

    public void setAgent_fax(String agent_fax) {
        this.agent_fax = agent_fax;
    }

    public String getAgent_email() {
        return agent_email;
    }

    public void setAgent_email(String agent_email) {
        this.agent_email = agent_email;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getIs_correction() {
        return is_correction;
    }

    public void setIs_correction(String is_correction) {
        this.is_correction = is_correction;
    }

    public String getIs_non_productive() {
        return is_non_productive;
    }

    public void setIs_non_productive(String is_non_productive) {
        this.is_non_productive = is_non_productive;
    }

    public String getUser_flags() {
        return user_flags;
    }

    public void setUser_flags(String user_flags) {
        this.user_flags = user_flags;
    }

    public String getParent_name() {
        return parent_name;
    }

    public void setParent_name(String parent_name) {
        this.parent_name = parent_name;
    }

    public String getAssign_code() {
        return assign_code;
    }

    public void setAssign_code(String assign_code) {
        this.assign_code = assign_code;
    }

    public String getChild_name() {
        return child_name;
    }

    public void setChild_name(String child_name) {
        this.child_name = child_name;
    }

    public String getChild_grp_code() {
        return child_grp_code;
    }

    public void setChild_grp_code(String child_grp_code) {
        this.child_grp_code = child_grp_code;
    }

    public String getUq_insured_name() {
        return uq_insured_name;
    }

    public void setUq_insured_name(String uq_insured_name) {
        this.uq_insured_name = uq_insured_name;
    }

    public String getUq_policy_number() {
        return uq_policy_number;
    }

    public void setUq_policy_number(String uq_policy_number) {
        this.uq_policy_number = uq_policy_number;
    }

    public String getUq_policy_type() {
        return uq_policy_type;
    }

    public void setUq_policy_type(String uq_policy_type) {
        this.uq_policy_type = uq_policy_type;
    }

    public String getUq_policy_end_date() {
        return uq_policy_end_date;
    }

    public void setUq_policy_end_date(String uq_policy_end_date) {
        this.uq_policy_end_date = uq_policy_end_date;
    }

    public String getUq_policy_ins_co() {
        return uq_policy_ins_co;
    }

    public void setUq_policy_ins_co(String uq_policy_ins_co) {
        this.uq_policy_ins_co = uq_policy_ins_co;
    }

    public String getUq_policy_code() {
        return uq_policy_code;
    }

    public void setUq_policy_code(String uq_policy_code) {
        this.uq_policy_code = uq_policy_code;
    }

    public String getUq_serial_num() {
        return uq_serial_num;
    }

    public void setUq_serial_num(String uq_serial_num) {
        this.uq_serial_num = uq_serial_num;
    }

    public String getUq_audit_type() {
        return uq_audit_type;
    }

    public void setUq_audit_type(String uq_audit_type) {
        this.uq_audit_type = uq_audit_type;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }

    public LocalDate getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(LocalDate creation_date) {
        this.creation_date = creation_date;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public LocalDate getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(LocalDate last_update_date) {
        this.last_update_date = last_update_date;
    }

    public String getLast_updated_by() {
        return last_updated_by;
    }

    public void setLast_updated_by(String last_updated_by) {
        this.last_updated_by = last_updated_by;
    }
}
