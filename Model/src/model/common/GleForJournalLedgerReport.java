package model.common;

import java.sql.Timestamp;

import oracle.jbo.ViewObject;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Apr 18 01:18:11 PKT 2018
// ---------------------------------------------------------------------
public interface GleForJournalLedgerReport extends ViewObject {
    void refreshQuery(String coaName, Timestamp startDate, Timestamp endDate);
}

