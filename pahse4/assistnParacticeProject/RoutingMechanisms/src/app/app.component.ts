import { Component } from '@angular/core';
import { ProductListComponent } from './product-list/product-list.component';

@Component({
  selector: 'app-root',
  styleUrls: ['./app.component.css'],
  template: `<product-list></product-list>`,
})
export class AppComponent {
  title = 'RoutingMechanisms';
}
