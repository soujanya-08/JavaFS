import { ChangeDetectorRef, Component } from '@angular/core';
import { VehicleService } from '../vehicle-service';
import { IVehicle } from '../ivehicle';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-vehicle-comp',
  imports: [FormsModule],
  templateUrl: './vehicle-comp.html',
  styleUrl: './vehicle-comp.css'
})
export class VehicleComp {
  constructor(private vehicleService: VehicleService,private cdr:ChangeDetectorRef){}
  vehicleList:IVehicle[]=[];
  vehicleEdit: IVehicle = {
    id: '',
    make: '',
    model: '',
    fuelType:'',
    price: 0
  };
  vehicleAdd: IVehicle = {
    id: '',
    make: '',
    model: '',
    fuelType:'',
    price: 0
  };
  ngOnInit(){
    this.vehicleService.getVehicles().subscribe((data:IVehicle[])=>{
      this.vehicleList= data;
      this.cdr.detectChanges();
      console.log(this.vehicleList);
    },
  (error)=>{
    console.log('Error fetching vehicle data:' + error);
  });

  }
  edit(vehicleid: string) {
    console.log('Edit vehicle with ID:', vehicleid);
    this.vehicleService.getVehicleById(vehicleid).subscribe((user: IVehicle) => {
      this.vehicleEdit = user;
      console.log('Vehicle for editing:', this.vehicleEdit);
       this.cdr.detectChanges();
    }, (error) => {
      console.error('Error fetching vehicle by ID:', error);
    });
  }
update() {
  console.log('Updating user:', this.vehicleEdit);
    this.vehicleService.updateVehicle(this.vehicleEdit).subscribe((updatedVehicle: IVehicle) => {
      const index = this.vehicleList.findIndex(v => v.id === updatedVehicle.id);
      if (index !== -1) {
        this.vehicleList[index] = updatedVehicle;
      }
      this.vehicleEdit = {
        id: '',
        make: '',
        model: '',
        fuelType:'',
        price: 0
      };
      this.cdr.detectChanges();
      this.ngOnInit();
    }, (error) => {
      console.error('Error updating vehicle:', error);
    });
}

delete(vehicleId: string) {
  this.vehicleService.deleteVehicle(vehicleId).subscribe(() => {
    console.log('Vehicle deleted successfully:', vehicleId);
    this.vehicleList = this.vehicleList.filter(v => v.id !== vehicleId);
    this.cdr.detectChanges();
    this.ngOnInit();
  }, (error) => {
    console.error('Error deleting user:', error);
  });


}

save(){

  console.log("saving data-"+this.vehicleAdd)
  this.vehicleService.saveVehicle(this.vehicleAdd).subscribe((newVehicle: IVehicle) => {
    console.log('Vehicle saved successfully:', newVehicle);
    this.vehicleList.push(newVehicle);
    this.vehicleAdd = {
      id: '',
      make: '',
      model: '',
      fuelType:'',
      price: 0
    };
    this.cdr.detectChanges();
  }, (error) => {
    console.error('Error saving user:', error);
  });

}

}
