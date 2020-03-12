import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateVillanoComponent } from './create-villano.component';

describe('CreateVillanoComponent', () => {
  let component: CreateVillanoComponent;
  let fixture: ComponentFixture<CreateVillanoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateVillanoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateVillanoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
