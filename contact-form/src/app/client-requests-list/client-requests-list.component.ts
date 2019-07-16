import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ContactFormComponent } from '../contact-form/contact-form.component';
import { ClientRequestsService } from '../service/data/client-requests.service';

export class ClientRequest{

  constructor(
    public id : number,
    public firstName : string,
    public lastName : string,
    public emailAddress : string,
    public postalAddress : string,
    public phone : string,
    public contactPurpose : string
  ) { }

}

@Component({
  selector: 'app-client-requests-list',
  templateUrl: './client-requests-list.component.html',
  styleUrls: ['./client-requests-list.component.css']
})
export class ClientRequestsListComponent implements OnInit {

  clientRequests : ClientRequest[]
  message : string

  // clientRequests= [
  //   new clientRequest(1, 'John', 'Smith', 'john.smith@cf.com', 'address 1', '333 444 555', 'the purpose of contact 1'),
  //   new clientRequest(2, 'Jane', 'Jones', 'john.smith@cf.com', 'address 1', '333 444 555', 'the purpose of contact 2')

    // {firstName : 'Jane', lastName : 'Jones', emailAddress : 'jane.jones@cf.com', postalAddress : 'address 1',
    //   phone : '333 444 555', contactPurpose : 'the purpose of contact 2'}
  //]

  /*
   clientRequest = {
     id : 1
    firstName : 'John',
    lastName : 'Smith',
    emailAddress : 'john.smith@cf.com',
    postalAddress : 'address 1',
    phone : '333 444 555',
    contactPurpose : 'the purpose of contact'
   }
  */

   // clientRequestsService handles retriving data from database
 constructor(
   private router : Router,
   private clientRequestsService : ClientRequestsService) { }

   // Getting all the Client Requests on init
  ngOnInit() {
    this.refreshRequestsList()
  }
  refreshRequestsList(){
    this.clientRequestsService.getAllClientsRequestsService().subscribe(
      response => {
        console.log(response);
        this.clientRequests = response;
      }
    )
  }

  butHandleGetClientsRequests() {
    this.refreshRequestsList()
  }
     // Getting all the Client Requests by clicking the button
     /*
  butHandleGetClientsRequests() {
    console.log(" Get Client Requestes Rest Called.");
    console.log(this.clientRequestsService.getAllClientsRequestsService());

    this.clientRequestsService.getAllClientsRequestsService().subscribe(
      response => this.handleSuccessfulResponse(response),
      error => this.handleErrorResponse(error)
    );
    console.log("Get Client Requests Response.");
  }
  
  handleSuccessfulResponse(response){
    console.log(response);
  }
  handleErrorResponse(error){
    console.log(error);
  }
  */
  deleteClientRequest(id){
    console.log(`Delete Client Request ${id}` )
    this.clientRequestsService.deleteClientRequest(id).subscribe(
      response => {
        console.log(response);
        this.message = 'Request has been successfully deleted.';
        this.refreshRequestsList()
      }

    )
  }


}
