import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {

  studentName : string = "";
  studentEmail : string = "";
  studentDob : any ;
  studentAge : string = "";
  studentPassword : string = "";

  route: string | undefined;


  constructor(private http: HttpClient , private router : Router )
  {
    this.route = router.url;
  }
  save()
  {

    if(this.studentName === "" || this.studentAge==="" || this.studentDob==="" || this.studentEmail==="" || this.studentPassword==="")
    {
      alert("Please Enter Valid Input !!");
    }
    else{
      let bodyData = {
        "studentName" : this.studentName,
        "studentEmail" : this.studentEmail,
        "studentDob" : this.studentDob,
        "studentAge" : this.studentAge,
        "studentPassword" : this.studentPassword
      };
      this.http.post("http://localhost:8080/api/v1/student/savestudents",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
      {
          console.log(resultData);
          alert("Student Registered Successfully");
          //this.router.navigateByUrl('/home');

          this.studentName = "";
          this.studentEmail = "";
          this.studentPassword = "";
          this.studentAge = "";
          this.studentDob = "";
      });
    }

  }

}
