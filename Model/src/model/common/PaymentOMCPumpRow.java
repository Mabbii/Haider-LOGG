package model.common;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Row;
import oracle.jbo.domain.DBSequence;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Dec 27 01:14:37 PKT 2017
// ---------------------------------------------------------------------
public interface PaymentOMCPumpRow extends Row {
    Timestamp getTnsDate();

    void setTnsDate(Timestamp value);

    DBSequence getTnsId();

    void setTnsId(DBSequence value);

    BigDecimal getTnsAmount();

    void setTnsAmount(BigDecimal value);

    String getTnsInfo();

    void setTnsInfo(String value);

    Timestamp getTnsSlipDate();

    void setTnsSlipDate(Timestamp value);

    String getTnsSlipNo();

    void setTnsSlipNo(String value);

    Long getTnsCoaCactNumber();

    void setTnsCoaCactNumber(Long value);

    Long getTnsCoaDactNumber();

    void setTnsCoaDactNumber(Long value);

    Long getTnsTnsTypeIdFk();

    Long getTnsTnsviewId();

    void setTnsTnsviewId(Long value);

    Long getTnsBankTnsTypeIdFk();

    void setTnsBankTnsTypeIdFk(Long value);

    String getBankTnsTypeName();

    void setBankTnsTypeName(String value);

    DBSequence getBankTnsTypeId();

    void setBankTnsTypeId(DBSequence value);

    String getCoaName();

    void setCoaName(String value);

    Long getCoaActNumber();

    void setCoaActNumber(Long value);

    Long getCoaCode();

    void setCoaCode(Long value);

    BigDecimal getCoaBalance();

    Long getCoaBactId();

    void setCoaBactId(Long value);

    String getCoaName1();

    void setCoaName1(String value);

    Long getCoaActNumber1();

    void setCoaActNumber1(Long value);

    Long getCoaCode1();

    void setCoaCode1(Long value);

    Long getCoaPartyId();

    void setCoaPartyId(Long value);

    String getTnsDetail();

    void setTnsDetail(String value);

    BigDecimal getCoaBalance1();

    String getBankName1();

    void setBankName1(String value);

    DBSequence getBankNameId();

    void setBankNameId(DBSequence value);

    Long getTnsBankNameId();

    void setTnsBankNameId(Long value);

    String getTnsBrCode();

    void setTnsBrCode(String value);

    String getTnsSpellAmount();

    void setTnsSpellAmount(String value);

    BigDecimal getTnsFormatAmount();

    void setTnsFormatAmount(BigDecimal value);

    Timestamp getTnsSDate();

    void setTnsSDate(Timestamp value);
}

