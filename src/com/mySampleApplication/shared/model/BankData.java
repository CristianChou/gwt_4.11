package com.mySampleApplication.shared.model;

import com.extjs.gxt.ui.client.data.BaseModelData;

import java.io.Serializable;

/**
 * @author dongyunqi
 * @date 2017年9月6日上午9:28:56
 * @description 银行实体类 表：BANK
 */
public class BankData extends BaseModelData implements Serializable {

    private Long bankCode;//主键、银行代码
    private String bankName;//银行名称
    public Long getBankCode() {
        return bankCode;
    }
    public void setBankCode(Long bankCode) {
        set("bankCode", bankCode);
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        set("bankName", bankName);
        this.bankName = bankName;
    }
}
