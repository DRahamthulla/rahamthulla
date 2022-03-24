import { Component } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Validators } from '@angular/forms';
import { FormGroup } from '@angular/forms';
import { Title } from '@angular/platform-browser';
import {} from '@angular/common';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  constructor(private formBuilder: FormBuilder) {}
  title = 'FormValidations';
  status = "You haven't signed up yet";
  name = '';
  submitted = false;
  registerForm!: FormGroup;
  ontyping(event: Event) {
    this.name = (<HTMLInputElement>event.target).value;
  }
  signup() {
    this.status = 'Oops! We are working on it!';
  }

  ngOnInit() {
    this.registerForm = this.formBuilder.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(6)]],
    });
  }

  get f() {
    return this.registerForm.controls;
  }

  onSubmit() {
    this.submitted = true;

    // stop here if form is invalid
    if (this.registerForm.invalid) {
      return;
    }

    alert('Your request has been submitted for approval');
  }
}
