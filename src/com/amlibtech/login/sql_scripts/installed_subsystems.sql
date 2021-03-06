USE ALTASP;

DROP TABLE IF EXISTS installed_subsystems;



CREATE TABLE `installed_subsystems` (
	`subscriber_Organization_Id` varchar(30) NOT NULL default '',
	`portal_Name` varchar(30) NOT NULL default '',
	`asp_Management` bool NOT NULL,
	`site_Management` bool NOT NULL,
	`company_Management` bool NOT NULL,
	`person_Management` bool NOT NULL,
	`organization_Management` bool NOT NULL,
	`customer_Management` bool NOT NULL,
	`vendor_Management` bool NOT NULL,
	`employee_Management` bool NOT NULL,
	`general_Ledger` bool NOT NULL,
	`accounts_Payable` bool NOT NULL,
	`accounts_Receivable` bool NOT NULL,
	`inventory` bool NOT NULL,
	`gleeson_Time_Clock` bool NOT NULL,
	`time_Billing` bool NOT NULL,
	`bill_Of_Material` bool NOT NULL,
	`factory_Order_Completion` bool NOT NULL,
	`factory_Order_Entry` bool NOT NULL,
	`factory_Order_Time_Reporting` bool NOT NULL,
	`payroll` bool NOT NULL,
	`sales_Order_Entry` bool NOT NULL,
	`sales_Order_Invoicing` bool NOT NULL,
	`credit_Cards` bool NOT NULL,
	`product_Sales_History` bool NOT NULL,
	`customer_Sales_History` bool NOT NULL,
	`sales_Commission` bool NOT NULL,
	`purchase_Order_Entry` bool NOT NULL,
	`vendor_Purchase_History` bool NOT NULL,
	`sales_Order_Shipping` bool NOT NULL,
	`purchase_Order_Receiving` bool NOT NULL,
	`purchase_Order_Tie_To_Ap` bool NOT NULL,
	`sales_Forecasting` bool NOT NULL,
	`Factory Purchase Scheduling` bool NOT NULL,
	`survey_Questionnaire` bool NOT NULL,
	`isp_Management` bool NOT NULL,
	`sales_Agent_Quotation` bool NOT NULL,
	`enroll_Em_Admin` bool NOT NULL,
	`enroll_Em_Billable` bool NOT NULL,
	`enroll_Em_Registration` bool NOT NULL,
	`enroll_Em_Entities` bool NOT NULL,
	`enroll_Em_Accounts_Receivable` bool NOT NULL,
	`enroll_Em_Daily` bool NOT NULL,
	`enroll_Em_Eval` bool NOT NULL,
	`enroll_Em_Performance` bool NOT NULL,
	`enroll_Em_Reports` bool NOT NULL,
        PRIMARY KEY  (`subscriber_Organization_Id`, `portal_Name`)
) TYPE=InnoDB;

