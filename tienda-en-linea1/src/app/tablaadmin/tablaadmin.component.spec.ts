import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TablaadminComponent } from './tablaadmin.component';

describe('TablaadminComponent', () => {
  let component: TablaadminComponent;
  let fixture: ComponentFixture<TablaadminComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TablaadminComponent]
    });
    fixture = TestBed.createComponent(TablaadminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
