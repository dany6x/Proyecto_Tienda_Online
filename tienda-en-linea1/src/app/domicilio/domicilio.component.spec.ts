import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DomicilioComponent } from './domicilio.component';

describe('DomicilioComponent', () => {
  let component: DomicilioComponent;
  let fixture: ComponentFixture<DomicilioComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DomicilioComponent]
    });
    fixture = TestBed.createComponent(DomicilioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
