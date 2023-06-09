export class OrderHistory {
    constructor(public id: string,
                public orderTrakingNumber: string,
                public totalPrice: number,
                public totalQuantity: number,
                public dateCreated: Date){
                    
                }
}
