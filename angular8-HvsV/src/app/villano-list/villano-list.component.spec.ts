import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VillanoListComponent } from './villano-list.component';

describe('VillanoListComponent', () => {
  let component: VillanoListComponent;
  let fixture: ComponentFixture<VillanoListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VillanoListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VillanoListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
