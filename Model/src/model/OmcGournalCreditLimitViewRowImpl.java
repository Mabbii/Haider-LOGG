package model;

import java.math.BigDecimal;

import java.math.RoundingMode;

import java.sql.Timestamp;

import oracle.jbo.ApplicationModule;
import oracle.jbo.RowSet;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Apr 25 06:55:03 PKT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OmcGournalCreditLimitViewRowImpl extends ViewRowImpl {
    public static final int ENTITY_OMCGOURNALCREDITLIMIT = 0;
    public static final int ENTITY_CHARTOFACCOUNTS = 1;
    public static final int ENTITY_TRANSACTION = 2;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        OmcgClId,
        OmcgClStartDate,
        OmcgClEndDate,
        OmcgClLimitDate,
        OmcgClSysDate,
        OmcgClApprovedFrom,
        OmcgClRate,
        OmcgClVolume,
        OmcgClAmount,
        OmcgClDetail,
        OmcgClDevDetail,
        OmcgClPartyIdFk,
        CoaName,
        CoaActNumber,
        TnsSpellAmount,
        TnsId,
        TnsFormatAmount,
        COA_suplier_TraderOnly1;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int OMCGCLID = AttributesEnum.OmcgClId.index();
    public static final int OMCGCLSTARTDATE = AttributesEnum.OmcgClStartDate.index();
    public static final int OMCGCLENDDATE = AttributesEnum.OmcgClEndDate.index();
    public static final int OMCGCLLIMITDATE = AttributesEnum.OmcgClLimitDate.index();
    public static final int OMCGCLSYSDATE = AttributesEnum.OmcgClSysDate.index();
    public static final int OMCGCLAPPROVEDFROM = AttributesEnum.OmcgClApprovedFrom.index();
    public static final int OMCGCLRATE = AttributesEnum.OmcgClRate.index();
    public static final int OMCGCLVOLUME = AttributesEnum.OmcgClVolume.index();
    public static final int OMCGCLAMOUNT = AttributesEnum.OmcgClAmount.index();
    public static final int OMCGCLDETAIL = AttributesEnum.OmcgClDetail.index();
    public static final int OMCGCLDEVDETAIL = AttributesEnum.OmcgClDevDetail.index();
    public static final int OMCGCLPARTYIDFK = AttributesEnum.OmcgClPartyIdFk.index();
    public static final int COANAME = AttributesEnum.CoaName.index();
    public static final int COAACTNUMBER = AttributesEnum.CoaActNumber.index();
    public static final int TNSSPELLAMOUNT = AttributesEnum.TnsSpellAmount.index();
    public static final int TNSID = AttributesEnum.TnsId.index();
    public static final int TNSFORMATAMOUNT = AttributesEnum.TnsFormatAmount.index();
    public static final int COA_SUPLIER_TRADERONLY1 = AttributesEnum.COA_suplier_TraderOnly1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public OmcGournalCreditLimitViewRowImpl() {
    }

    /**
     * Gets OmcGournalCreditLimit entity object.
     * @return the OmcGournalCreditLimit
     */
    public EntityImpl getOmcGournalCreditLimit() {
        return (EntityImpl) getEntity(ENTITY_OMCGOURNALCREDITLIMIT);
    }

    /**
     * Gets ChartOfAccounts entity object.
     * @return the ChartOfAccounts
     */
    public EntityImpl getChartOfAccounts() {
        return (EntityImpl) getEntity(ENTITY_CHARTOFACCOUNTS);
    }

    /**
     * Gets Transaction entity object.
     * @return the Transaction
     */
    public EntityImpl getTransaction() {
        return (EntityImpl) getEntity(ENTITY_TRANSACTION);
    }

    /**
     * Gets the attribute value for OMCG_CL_ID using the alias name OmcgClId.
     * @return the OMCG_CL_ID
     */
    public DBSequence getOmcgClId() {
        return (DBSequence) getAttributeInternal(OMCGCLID);
    }

    /**
     * Sets <code>value</code> as attribute value for OMCG_CL_ID using the alias name OmcgClId.
     * @param value value to set the OMCG_CL_ID
     */
    public void setOmcgClId(DBSequence value) {
        setAttributeInternal(OMCGCLID, value);
    }

    /**
     * Gets the attribute value for OMCG_CL_START_DATE using the alias name OmcgClStartDate.
     * @return the OMCG_CL_START_DATE
     */
    public Timestamp getOmcgClStartDate() {
        return (Timestamp) getAttributeInternal(OMCGCLSTARTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for OMCG_CL_START_DATE using the alias name OmcgClStartDate.
     * @param value value to set the OMCG_CL_START_DATE
     */
    public void setOmcgClStartDate(Timestamp value) {
        setAttributeInternal(OMCGCLSTARTDATE, value);
    }

    /**
     * Gets the attribute value for OMCG_CL_END_DATE using the alias name OmcgClEndDate.
     * @return the OMCG_CL_END_DATE
     */
    public Timestamp getOmcgClEndDate() {
        return (Timestamp) getAttributeInternal(OMCGCLENDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for OMCG_CL_END_DATE using the alias name OmcgClEndDate.
     * @param value value to set the OMCG_CL_END_DATE
     */
    public void setOmcgClEndDate(Timestamp value) {
        setAttributeInternal(OMCGCLENDDATE, value);
    }

    /**
     * Gets the attribute value for OMCG_CL_LIMIT_DATE using the alias name OmcgClLimitDate.
     * @return the OMCG_CL_LIMIT_DATE
     */
    public Timestamp getOmcgClLimitDate() {
        return (Timestamp) getAttributeInternal(OMCGCLLIMITDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for OMCG_CL_LIMIT_DATE using the alias name OmcgClLimitDate.
     * @param value value to set the OMCG_CL_LIMIT_DATE
     */
    public void setOmcgClLimitDate(Timestamp value) {
        setAttributeInternal(OMCGCLLIMITDATE, value);
    }

    /**
     * Gets the attribute value for OMCG_CL_SYS_DATE using the alias name OmcgClSysDate.
     * @return the OMCG_CL_SYS_DATE
     */
    public Timestamp getOmcgClSysDate() {
        return (Timestamp) getAttributeInternal(OMCGCLSYSDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for OMCG_CL_SYS_DATE using the alias name OmcgClSysDate.
     * @param value value to set the OMCG_CL_SYS_DATE
     */
    public void setOmcgClSysDate(Timestamp value) {
        setAttributeInternal(OMCGCLSYSDATE, value);
    }

    /**
     * Gets the attribute value for OMCG_CL_APPROVED_FROM using the alias name OmcgClApprovedFrom.
     * @return the OMCG_CL_APPROVED_FROM
     */
    public Timestamp getOmcgClApprovedFrom() {
        return (Timestamp) getAttributeInternal(OMCGCLAPPROVEDFROM);
    }

    /**
     * Sets <code>value</code> as attribute value for OMCG_CL_APPROVED_FROM using the alias name OmcgClApprovedFrom.
     * @param value value to set the OMCG_CL_APPROVED_FROM
     */
    public void setOmcgClApprovedFrom(Timestamp value) {
        setAttributeInternal(OMCGCLAPPROVEDFROM, value);
    }

    /**
     * Gets the attribute value for OMCG_CL_RATE using the alias name OmcgClRate.
     * @return the OMCG_CL_RATE
     */
    public BigDecimal getOmcgClRate() {
        return (BigDecimal) getAttributeInternal(OMCGCLRATE);
    }

    /**
     * Sets <code>value</code> as attribute value for OMCG_CL_RATE using the alias name OmcgClRate.
     * @param value value to set the OMCG_CL_RATE
     */
    public void setOmcgClRate(BigDecimal value) {
        setAttributeInternal(OMCGCLRATE, value);
        this.calculateAmount();
    }

    /**
     * Gets the attribute value for OMCG_CL_VOLUME using the alias name OmcgClVolume.
     * @return the OMCG_CL_VOLUME
     */
    public BigDecimal getOmcgClVolume() {
        return (BigDecimal) getAttributeInternal(OMCGCLVOLUME);
    }

    /**
     * Sets <code>value</code> as attribute value for OMCG_CL_VOLUME using the alias name OmcgClVolume.
     * @param value value to set the OMCG_CL_VOLUME
     */
    public void setOmcgClVolume(BigDecimal value) {
        setAttributeInternal(OMCGCLVOLUME, value);
        this.calculateAmount();
    }

    /**
     * Gets the attribute value for OMCG_CL_AMOUNT using the alias name OmcgClAmount.
     * @return the OMCG_CL_AMOUNT
     */
    public BigDecimal getOmcgClAmount() {
        return (BigDecimal) getAttributeInternal(OMCGCLAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for OMCG_CL_AMOUNT using the alias name OmcgClAmount.
     * @param value value to set the OMCG_CL_AMOUNT
     */
    public void setOmcgClAmount(BigDecimal value) {
        setAttributeInternal(OMCGCLAMOUNT, value);
    }

    /**
     * Gets the attribute value for OMCG_CL_DETAIL using the alias name OmcgClDetail.
     * @return the OMCG_CL_DETAIL
     */
    public String getOmcgClDetail() {
        return (String) getAttributeInternal(OMCGCLDETAIL);
    }

    /**
     * Sets <code>value</code> as attribute value for OMCG_CL_DETAIL using the alias name OmcgClDetail.
     * @param value value to set the OMCG_CL_DETAIL
     */
    public void setOmcgClDetail(String value) {
        setAttributeInternal(OMCGCLDETAIL, value);
    }

    /**
     * Gets the attribute value for OMCG_CL_DEV_DETAIL using the alias name OmcgClDevDetail.
     * @return the OMCG_CL_DEV_DETAIL
     */
    public String getOmcgClDevDetail() {
        return (String) getAttributeInternal(OMCGCLDEVDETAIL);
    }

    /**
     * Sets <code>value</code> as attribute value for OMCG_CL_DEV_DETAIL using the alias name OmcgClDevDetail.
     * @param value value to set the OMCG_CL_DEV_DETAIL
     */
    public void setOmcgClDevDetail(String value) {
        setAttributeInternal(OMCGCLDEVDETAIL, value);
    }

    /**
     * Gets the attribute value for OMCG_CL_PARTY_ID_FK using the alias name OmcgClPartyIdFk.
     * @return the OMCG_CL_PARTY_ID_FK
     */
    public Long getOmcgClPartyIdFk() {
        return (Long) getAttributeInternal(OMCGCLPARTYIDFK);
    }

    /**
     * Sets <code>value</code> as attribute value for OMCG_CL_PARTY_ID_FK using the alias name OmcgClPartyIdFk.
     * @param value value to set the OMCG_CL_PARTY_ID_FK
     */
    public void setOmcgClPartyIdFk(Long value) {
        setAttributeInternal(OMCGCLPARTYIDFK, value);
    }

    /**
     * Gets the attribute value for COA_NAME using the alias name CoaName.
     * @return the COA_NAME
     */
    public String getCoaName() {
        return (String) getAttributeInternal(COANAME);
    }

    /**
     * Sets <code>value</code> as attribute value for COA_NAME using the alias name CoaName.
     * @param value value to set the COA_NAME
     */
    public void setCoaName(String value) {
        setAttributeInternal(COANAME, value);
    }

    /**
     * Gets the attribute value for COA_ACT_NUMBER using the alias name CoaActNumber.
     * @return the COA_ACT_NUMBER
     */
    public Long getCoaActNumber() {
        return (Long) getAttributeInternal(COAACTNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for COA_ACT_NUMBER using the alias name CoaActNumber.
     * @param value value to set the COA_ACT_NUMBER
     */
    public void setCoaActNumber(Long value) {
        setAttributeInternal(COAACTNUMBER, value);
    }

    /**
     * Gets the attribute value for TNS_SPELL_AMOUNT using the alias name TnsSpellAmount.
     * @return the TNS_SPELL_AMOUNT
     */
    public String getTnsSpellAmount() {
        return (String) getAttributeInternal(TNSSPELLAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for TNS_SPELL_AMOUNT using the alias name TnsSpellAmount.
     * @param value value to set the TNS_SPELL_AMOUNT
     */
    public void setTnsSpellAmount(String value) {
        setAttributeInternal(TNSSPELLAMOUNT, value);
    }

    /**
     * Gets the attribute value for TNS_ID using the alias name TnsId.
     * @return the TNS_ID
     */
    public DBSequence getTnsId() {
        return (DBSequence) getAttributeInternal(TNSID);
    }

    /**
     * Sets <code>value</code> as attribute value for TNS_ID using the alias name TnsId.
     * @param value value to set the TNS_ID
     */
    public void setTnsId(DBSequence value) {
        setAttributeInternal(TNSID, value);
    }

    /**
     * Gets the attribute value for TNS_FORMAT_AMOUNT using the alias name TnsFormatAmount.
     * @return the TNS_FORMAT_AMOUNT
     */
    public BigDecimal getTnsFormatAmount() {
        return (BigDecimal) getAttributeInternal(TNSFORMATAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for TNS_FORMAT_AMOUNT using the alias name TnsFormatAmount.
     * @param value value to set the TNS_FORMAT_AMOUNT
     */
    public void setTnsFormatAmount(BigDecimal value) {
        setAttributeInternal(TNSFORMATAMOUNT, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> COA_suplier_TraderOnly1.
     */
    public RowSet getCOA_suplier_TraderOnly1() {
        return (RowSet) getAttributeInternal(COA_SUPLIER_TRADERONLY1);
    }
    public void calculateAmount(){
          BigDecimal value;
         
         
          BigDecimal Rate=(this.getOmcgClRate());
          
         
         
            value=Rate.multiply(this.getOmcgClVolume());  
             
          
              
          value=value.setScale(2, RoundingMode.HALF_UP);
          setAttributeInternal(OMCGCLAMOUNT, value);
          setAttributeInternal(TNSFORMATAMOUNT, value);
          String str=this.SpellAmount();
          this.setTnsSpellAmount(str);
         
      }
          public String SpellAmount() {
              String res = "ERROR"; 
              ApplicationModule applicationModule = getApplicationModule();
              
              if (applicationModule instanceof VOAPPImpl){  
                         VOAPPImpl am = (VOAPPImpl) applicationModule;  
                        res = am.get_Spell_number(this.getOmcgClAmount());
                            //pass values from current row to plsql func and get resut  
                     }  
              return res;
              //return (String) getAttributeInternal(TNSSPELLAMOUNT);
          }
      }

