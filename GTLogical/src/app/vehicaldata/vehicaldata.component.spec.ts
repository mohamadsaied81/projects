import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VehicaldataComponent } from './vehicaldata.component';

describe('VehicaldataComponent', () => {
  let component: VehicaldataComponent;
  let fixture: ComponentFixture<VehicaldataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VehicaldataComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(VehicaldataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
