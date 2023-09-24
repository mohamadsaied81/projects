export class Vehicledata {
  data!: Datum[];
  page!: number;
  size!: number;
  totalRecords!: number;
}

export class Datum {
  id!: string;
  softwareId!: string;
  vtuType!: string;
  vtuTypeId!: string;
  vtuId!: number;
  vehicle!: Vehicle;
  account!: Account;
}

export class Vehicle {
  id!: string;
  vehicleId!: number;
  vehicleNumber!: string;
}

export class Account {
  id!: string;
  accountId!: number;
  accountName!: string;
}
