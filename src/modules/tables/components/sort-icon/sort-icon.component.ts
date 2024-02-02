import { ChangeDetectionStrategy, Component, Input, OnInit } from '@angular/core';

@Component({
    selector: 'vc-sort-icon',
    changeDetection: ChangeDetectionStrategy.OnPush,
    templateUrl: './sort-icon.component.html',
    styleUrls: ['sort-icon.component.scss'],
})
export class SortIconComponent implements OnInit {
    @Input() direction!: string;

    constructor() {}
    ngOnInit() {}
}
