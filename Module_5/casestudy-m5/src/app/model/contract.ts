import { Facility } from './facility';
import { Customer } from './customer';
export interface Contract {
    contractId?: number;
    customer? : Customer ;
    service? : Facility;
    startDateContract : String;
    endDateContract : String;
    contractDeposits : number ;
    contractTotalMoney : number ;
}
