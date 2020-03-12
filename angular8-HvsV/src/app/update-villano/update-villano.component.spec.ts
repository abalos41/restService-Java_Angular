import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateVillanoComponent } from './update-villano.component';

describe('UpdateVillanoComponent', () => {
  let component: UpdateVillanoComponent;
  let fixture: ComponentFixture<UpdateVillanoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateVillanoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateVillanoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
