import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  studentEmail : string = "";
  studentPassword : string = "";


  constructor(private router: Router,private http: HttpClient )
  {
  }

  login(){
    if(this.studentEmail === "" || this.studentPassword=== ""){
      alert("Please Enter Valid Input !!");
    }

    else{
      let bodyData = {
        "studentEmail": this.studentEmail,
        "studentPassword": this.studentPassword,
      };

      this.http.post("http://localhost:8080/api/v1/student/login",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
      {
        console.log(resultData);
        if (resultData == "Email Not Exists")
        {
          alert("Email not exits");
          this.studentEmail = "";
          this.studentPassword = "";

        }
        else if(resultData == "Login Success")
        {
          alert("Login Successfull");
          //this.router.navigateByUrl('/homepage');
          this.studentEmail = "";
          this.studentPassword = "";
        }
        else
        {
          alert("Incorrect Email and Password not match");
          this.studentEmail = "";
          this.studentPassword = "";

        }
      });
    }
 }
}
