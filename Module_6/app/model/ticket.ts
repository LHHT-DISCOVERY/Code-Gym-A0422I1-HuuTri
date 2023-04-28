import {Customer} from "./customer";
import {Showtime} from "./showtime";
import {ChairRoom} from "./chair-room";

export interface Ticket {
  id: string;
  customer: Customer;
  showTime: Showtime;
  chairRoom: ChairRoom;
  price: number;
  status: boolean;
  book_datetime: string;
  isDelete: boolean;
}
