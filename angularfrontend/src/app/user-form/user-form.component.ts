import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { Router } from '@angular/router';
import { UserService } from '../user-service/user-service.service';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  user: User;

  constructor(
    private router: Router, 
    private userService: UserService
  ) { 
    this.user = new User();
  }

  ngOnInit(): void { }

  onSubmit() {
    this.userService.saveUser(this.user).subscribe(result => {
      this.navigateToUserList();
    })
  }
 
  navigateToUserList() {
    this.router.navigate(['/users']);
  }

}
