package model;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Apr 20 05:12:47 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TankInfoViewRowImpl extends ViewRowImpl {
    public static final int ENTITY_TANKINFO = 0;
    public static final int ENTITY_PRODUCT = 1;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        TankInfoId,
        TankInfoName,
        TankInfoMinStock,
        TankInfoCapacity,
        TankInfoOflowDip,
        ProductShortname,
        ProductId,
        TankInfoExtStorage,
        TankInfoInit,
        TankInfoDate,
        ProductIdFk,
        TankDipDataView,
        NozalTankMapView,
        Product_Fuel_only1,
        YESNOViewObj1,
        Product_Fuel_only2,
        TankInfoView1;
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
    public static final int TANKINFOID = AttributesEnum.TankInfoId.index();
    public static final int TANKINFONAME = AttributesEnum.TankInfoName.index();
    public static final int TANKINFOMINSTOCK = AttributesEnum.TankInfoMinStock.index();
    public static final int TANKINFOCAPACITY = AttributesEnum.TankInfoCapacity.index();
    public static final int TANKINFOOFLOWDIP = AttributesEnum.TankInfoOflowDip.index();
    public static final int PRODUCTSHORTNAME = AttributesEnum.ProductShortname.index();
    public static final int PRODUCTID = AttributesEnum.ProductId.index();
    public static final int TANKINFOEXTSTORAGE = AttributesEnum.TankInfoExtStorage.index();
    public static final int TANKINFOINIT = AttributesEnum.TankInfoInit.index();
    public static final int TANKINFODATE = AttributesEnum.TankInfoDate.index();
    public static final int PRODUCTIDFK = AttributesEnum.ProductIdFk.index();
    public static final int TANKDIPDATAVIEW = AttributesEnum.TankDipDataView.index();
    public static final int NOZALTANKMAPVIEW = AttributesEnum.NozalTankMapView.index();
    public static final int PRODUCT_FUEL_ONLY1 = AttributesEnum.Product_Fuel_only1.index();
    public static final int YESNOVIEWOBJ1 = AttributesEnum.YESNOViewObj1.index();
    public static final int PRODUCT_FUEL_ONLY2 = AttributesEnum.Product_Fuel_only2.index();
    public static final int TANKINFOVIEW1 = AttributesEnum.TankInfoView1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TankInfoViewRowImpl() {
    }

    /**
     * Gets TankInfo entity object.
     * @return the TankInfo
     */
    public EntityImpl getTankInfo() {
        return (EntityImpl) getEntity(ENTITY_TANKINFO);
    }

    /**
     * Gets Product entity object.
     * @return the Product
     */
    public EntityImpl getProduct() {
        return (EntityImpl) getEntity(ENTITY_PRODUCT);
    }

    /**
     * Gets the attribute value for TANK_INFO_ID using the alias name TankInfoId.
     * @return the TANK_INFO_ID
     */
    public DBSequence getTankInfoId() {
        return (DBSequence) getAttributeInternal(TANKINFOID);
    }

    /**
     * Sets <code>value</code> as attribute value for TANK_INFO_ID using the alias name TankInfoId.
     * @param value value to set the TANK_INFO_ID
     */
    public void setTankInfoId(DBSequence value) {
        setAttributeInternal(TANKINFOID, value);
    }

    /**
     * Gets the attribute value for TANK_INFO_NAME using the alias name TankInfoName.
     * @return the TANK_INFO_NAME
     */
    public String getTankInfoName() {
        return (String) getAttributeInternal(TANKINFONAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TANK_INFO_NAME using the alias name TankInfoName.
     * @param value value to set the TANK_INFO_NAME
     */
    public void setTankInfoName(String value) {
        setAttributeInternal(TANKINFONAME, value);
    }

    /**
     * Gets the attribute value for TANK_INFO_MIN_STOCK using the alias name TankInfoMinStock.
     * @return the TANK_INFO_MIN_STOCK
     */
    public Long getTankInfoMinStock() {
        return (Long) getAttributeInternal(TANKINFOMINSTOCK);
    }

    /**
     * Sets <code>value</code> as attribute value for TANK_INFO_MIN_STOCK using the alias name TankInfoMinStock.
     * @param value value to set the TANK_INFO_MIN_STOCK
     */
    public void setTankInfoMinStock(Long value) {
        setAttributeInternal(TANKINFOMINSTOCK, value);
    }

    /**
     * Gets the attribute value for TANK_INFO_CAPACITY using the alias name TankInfoCapacity.
     * @return the TANK_INFO_CAPACITY
     */
    public Long getTankInfoCapacity() {
        return (Long) getAttributeInternal(TANKINFOCAPACITY);
    }

    /**
     * Sets <code>value</code> as attribute value for TANK_INFO_CAPACITY using the alias name TankInfoCapacity.
     * @param value value to set the TANK_INFO_CAPACITY
     */
    public void setTankInfoCapacity(Long value) {
        setAttributeInternal(TANKINFOCAPACITY, value);
    }

    /**
     * Gets the attribute value for TANK_INFO_OFLOW_DIP using the alias name TankInfoOflowDip.
     * @return the TANK_INFO_OFLOW_DIP
     */
    public Long getTankInfoOflowDip() {
        return (Long) getAttributeInternal(TANKINFOOFLOWDIP);
    }

    /**
     * Sets <code>value</code> as attribute value for TANK_INFO_OFLOW_DIP using the alias name TankInfoOflowDip.
     * @param value value to set the TANK_INFO_OFLOW_DIP
     */
    public void setTankInfoOflowDip(Long value) {
        setAttributeInternal(TANKINFOOFLOWDIP, value);
    }

    /**
     * Gets the attribute value for PRODUCT_SHORTNAME using the alias name ProductShortname.
     * @return the PRODUCT_SHORTNAME
     */
    public String getProductShortname() {
        return (String) getAttributeInternal(PRODUCTSHORTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for PRODUCT_SHORTNAME using the alias name ProductShortname.
     * @param value value to set the PRODUCT_SHORTNAME
     */
    public void setProductShortname(String value) {
        setAttributeInternal(PRODUCTSHORTNAME, value);
    }

    /**
     * Gets the attribute value for PRODUCT_ID using the alias name ProductId.
     * @return the PRODUCT_ID
     */
    public DBSequence getProductId() {
        return (DBSequence) getAttributeInternal(PRODUCTID);
    }

    /**
     * Sets <code>value</code> as attribute value for PRODUCT_ID using the alias name ProductId.
     * @param value value to set the PRODUCT_ID
     */
    public void setProductId(DBSequence value) {
        setAttributeInternal(PRODUCTID, value);
    }

    /**
     * Gets the attribute value for TANK_INFO_EXT_STORAGE using the alias name TankInfoExtStorage.
     * @return the TANK_INFO_EXT_STORAGE
     */
    public Long getTankInfoExtStorage() {
        return (Long) getAttributeInternal(TANKINFOEXTSTORAGE);
    }

    /**
     * Sets <code>value</code> as attribute value for TANK_INFO_EXT_STORAGE using the alias name TankInfoExtStorage.
     * @param value value to set the TANK_INFO_EXT_STORAGE
     */
    public void setTankInfoExtStorage(Long value) {
        setAttributeInternal(TANKINFOEXTSTORAGE, value);
    }

    /**
     * Gets the attribute value for TANK_INFO_INIT using the alias name TankInfoInit.
     * @return the TANK_INFO_INIT
     */
    public BigDecimal getTankInfoInit() {
        return (BigDecimal) getAttributeInternal(TANKINFOINIT);
    }

    /**
     * Sets <code>value</code> as attribute value for TANK_INFO_INIT using the alias name TankInfoInit.
     * @param value value to set the TANK_INFO_INIT
     */
    public void setTankInfoInit(BigDecimal value) {
        setAttributeInternal(TANKINFOINIT, value);
    }

    /**
     * Gets the attribute value for TANK_INFO_DATE using the alias name TankInfoDate.
     * @return the TANK_INFO_DATE
     */
    public Timestamp getTankInfoDate() {
        return (Timestamp) getAttributeInternal(TANKINFODATE);
    }

    /**
     * Sets <code>value</code> as attribute value for TANK_INFO_DATE using the alias name TankInfoDate.
     * @param value value to set the TANK_INFO_DATE
     */
    public void setTankInfoDate(Timestamp value) {
        setAttributeInternal(TANKINFODATE, value);
    }

    /**
     * Gets the attribute value for PRODUCT_ID_FK using the alias name ProductIdFk.
     * @return the PRODUCT_ID_FK
     */
    public BigDecimal getProductIdFk() {
        return (BigDecimal) getAttributeInternal(PRODUCTIDFK);
    }

    /**
     * Sets <code>value</code> as attribute value for PRODUCT_ID_FK using the alias name ProductIdFk.
     * @param value value to set the PRODUCT_ID_FK
     */
    public void setProductIdFk(BigDecimal value) {
        setAttributeInternal(PRODUCTIDFK, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link TankDipDataView.
     */
    public RowIterator getTankDipDataView() {
        return (RowIterator) getAttributeInternal(TANKDIPDATAVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link NozalTankMapView.
     */
    public RowIterator getNozalTankMapView() {
        return (RowIterator) getAttributeInternal(NOZALTANKMAPVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Product_Fuel_only1.
     */
    public RowSet getProduct_Fuel_only1() {
        return (RowSet) getAttributeInternal(PRODUCT_FUEL_ONLY1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> YESNOViewObj1.
     */
    public RowSet getYESNOViewObj1() {
        return (RowSet) getAttributeInternal(YESNOVIEWOBJ1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Product_Fuel_only2.
     */
    public RowSet getProduct_Fuel_only2() {
        return (RowSet) getAttributeInternal(PRODUCT_FUEL_ONLY2);
    }

    /**
     * Gets the view accessor <code>RowSet</code> TankInfoView1.
     */
    public RowSet getTankInfoView1() {
        return (RowSet) getAttributeInternal(TANKINFOVIEW1);
    }
}

