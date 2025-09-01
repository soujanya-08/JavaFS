export interface Payment {
    bookingId: string;
  senderName: string;
  accountNumber: string;
  cvv: string;
  mode: string;  
  amount?: number;
  status?: string;
}
