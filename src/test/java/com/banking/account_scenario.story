Scenario: Account managment
Given the Account balance is <account_balance>
Given A client makes a deposit of <amount_depot> on the date of <date_depot>
Given A client makes another deposit of <amount_depot> on the date of <date_depot>
Given The client makes a withrawal of <amount_withraw> on the date of <date_withraw>
When The client checks the history of operations
Then the account balance should be <newBalance>

Examples:
|account_balance|amount_depot |date_depot|amount_withraw|date_withraw|newBalance|
|0              |100          |15/09/2018|20            |16/09/2018  |180	    |









